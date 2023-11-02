package view;

public class OutputView {
    public void printInfo(String name, int age, boolean isBirthDay, boolean isUnderAge) {
        System.out.println(name + "(" + age + ")");

        if (isBirthDay) System.out.printf("%d번째 생일을 축하합니다.\n", age);

        System.out.println(isUnderAge ? "미성년자입니다." : "성인입니다.");
    }
}
