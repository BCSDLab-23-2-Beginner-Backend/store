package view;

public class OutputView {
    public void printAge(String name, int age, boolean isBirthDay, boolean isUnderAge){
        System.out.println(name + "(" + age + ")");
        if (isBirthDay) {
            System.out.printf("%d세의 생일을 축하합니다.\n", age);
        }

        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

}
