package view;

public class OutputView {
    public static void displayUserInfo(String name, int age){
        System.out.println(name + "(" + age + ")");
    }

    public static void displayBirthdayWish(int age){
        System.out.printf("%d번째 생일을 축하합니다.\n", age);
    }

    public static void displayAgeStatus(boolean isUnderAge){
        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}