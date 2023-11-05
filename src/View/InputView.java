package View;

import java.util.Scanner;

public class InputView {
    //콘솔로부터 입력 받기
    Scanner scanner = new Scanner(System.in);
    public int InputID(){
        System.out.println("아이디를 입력하세요 : ");
        return scanner.nextInt();
    }

}
