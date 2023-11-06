package View;

import java.util.Scanner;

public class InputView {
    public static int getId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        int inputId = scanner.nextInt();

        return inputId;
    }
}
