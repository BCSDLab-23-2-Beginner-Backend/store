package view;

import model.AgeCalculator;
import model.User;

import java.time.LocalDate;

public class OutputView {
    public void nameAge(User user, AgeCalculator ageCalculator) {
        LocalDate birth = user.getBirth();
        int age = ageCalculator.getAge(birth);
        String name = user.getName();

        System.out.println(name + "(" + age + ")");

        if (ageCalculator.isBirthDay(birth)) {
            System.out.printf("%d번째 생일을 축하합니다.\n", age);
        }

        if (ageCalculator.isUnderAge(birth)) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
