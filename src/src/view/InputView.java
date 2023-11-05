package src.view;

import java.util.Scanner;
public class InputView {
    Scanner scanner = new Scanner(System.in);
    public int getInputId()
    {
        System.out.print("아이디를 입력하세요 : ");
        return scanner.nextInt();
    }
}