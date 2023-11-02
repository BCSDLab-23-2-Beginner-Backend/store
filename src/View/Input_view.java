package View;

import java.util.Scanner;

public class Input_view  {
    public static int getInputId() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        int inputId = scanner.nextInt();
        return inputId;
    }
}
