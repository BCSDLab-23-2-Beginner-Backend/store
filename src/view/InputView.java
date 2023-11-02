package view;

import java.util.Scanner;

public class InputView {
    public int inputId() {
        //콘솔로부터 입력 받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");

        return scanner.nextInt();
    }
}
