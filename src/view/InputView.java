package view;

import java.util.Scanner;

public class InputView {
    // 콘솔로 부터 입력받기
    Scanner scanner = new Scanner(System.in);


    public int inputId() {
        System.out.print("아이디를 입력하세요 : ");
        return scanner.nextInt();
    }
}
