package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputId(){

        System.out.print("아이디를 입력하세요 : ");
        return scanner.nextInt();
    }


}
