package view;

public class OutputView {
    public void printUserInfo(String name, int age) {
        System.out.println(name + "(" + age + ")");
    }

    public void printBirthdayMessage(int age) {
        System.out.printf("%d번째 생일을 축하합니다.\n", age);
    }

    public void printUnderAgeMessage() {
        System.out.println("미성년자입니다.");
    }

    public void printAdultMessage() {
        System.out.println("성인입니다.");
    }
}
