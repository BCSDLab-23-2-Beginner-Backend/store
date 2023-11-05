package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int getInputId() {
        System.out.print("아이디를 입력하세요 : ");
        return scanner.nextInt();
    }
}