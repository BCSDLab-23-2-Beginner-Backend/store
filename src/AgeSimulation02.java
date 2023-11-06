import Model.AgeCalculator;
import Model.User;
import Model.UserRepository;

import java.util.Scanner;

public class AgeSimulation02 {
    public static void main(String[] args) {
        //콘솔로부터 입력 받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        int inputId = scanner.nextInt();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        System.out.println(user.getName() + "(" + age + ")");

        if (isBirthDay) {
            // System.out.printf("%d세의 생일을 축하합니다.\n", age);
            System.out.printf("%d번째 생일을 축하합니다.\n", age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

}
