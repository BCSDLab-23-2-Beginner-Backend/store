package view;
import java.util.Scanner;

public class myView {

    public int getId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        int inputId = scanner.nextInt();
        return inputId;
    }

    public int checkBirth(String userName, boolean isBirthDay, int age){
        System.out.println(userName + "(" + age + ")");
        if (isBirthDay) {
            System.out.printf("%d번째 생일을 축하합니다.\n", age);
        }
        return 0;
    }

    public int checkId(boolean isUnderAge){
        if (isUnderAge) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
        return 0;
    }
}
