package View;

import Model.User;

public class OutputView {
    public static void age_out(User user, int age) {
        System.out.println(user.getName() + "(" + age + ")");
    }

    public static void celebrate_out(boolean isBirthDay, int age) {
        if (isBirthDay) {
            // System.out.printf("%d세의 생일을 축하합니다.\n", age);
            System.out.printf("%d번째 생일을 축하합니다.\n", age);
        }
    }

    public static void minzza_out(boolean isUnderAge) {
        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
