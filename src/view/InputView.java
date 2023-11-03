package view;

import java.util.Scanner;

public class InputView {

    private Scanner in = null;

    public InputView(){
        in = new Scanner(System.in);
    }
    public int InputID(){
        System.out.print("아이디를 입력하세요 : ");
        return in.nextInt();
    }
}

