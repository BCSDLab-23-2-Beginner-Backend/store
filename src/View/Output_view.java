package View;

public class Output_view {
    public static void extract(boolean isUnderAge) {
        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
    public static void extracted(boolean isBirthDay, int age, String getName) {
        if (isBirthDay) {
            // System.out.printf("%d세의 생일을 축하합니다.\n", age);
            System.out.printf("%d번째 생일을 축하합니다.\n", age);
        }
        System.out.println(getName + "(" + age + ")");
    }
}
