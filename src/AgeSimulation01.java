import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgeSimulation01 {
    public static void main(String[] args) {
        //콘솔로부터 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        int inputId = sc.nextInt();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);

        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        System.out.println(user.getName() + "(" + age + ")");
        if (isBirthDay) {
            System.out.printf("%d세의 생일을 축하합니다.\n", age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

    public static class User {
        private String name;
        private LocalDate birth;

        public User(String name, LocalDate birth) {
            this.name = name;
            this.birth = birth;
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirth() {
            return birth;
        }
    }

    static class UserRepository {
        private static int sequence = 0;
        private static Map<Integer, User> users = new HashMap<>();

        public UserRepository() {
            users.put(++sequence, new User("홍길동", LocalDate.of(1990, 1, 1)));
            users.put(++sequence,
                new User("박한수", LocalDate.of(2000, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth())));
            users.put(++sequence, new User("강호동", LocalDate.of(2005, 6, 1)));
        }

        public User save(User user) {
            users.put(++sequence, user);
            return user;
        }

        public User findById(int id) {
            return users.get(id);
        }
    }

    private static class AgeCalculator {

        public boolean isUnderAge(LocalDate birth) {
            int age = getAge(birth);
            return age < 19;
        }

        public int getAge(LocalDate birth) {
            LocalDate now = LocalDate.now();

            int age = now.getYear() - birth.getYear();
            return age;
        }

        public boolean isBirthDay(LocalDate birth) {
            LocalDate now = LocalDate.now();
            return now.getMonthValue() == birth.getMonthValue() && now.getDayOfMonth() == birth.getDayOfMonth();
        }
    }
}
