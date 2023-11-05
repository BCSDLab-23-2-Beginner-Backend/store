package view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

//    public int selectCal(){
//        System.out.print("나이 계산기를 선택하세요. 1)만 나이  2)한국 나이  : ");
//        int numOfCal = scanner.nextInt();
//        return numOfCal;
//    }
    public int getID(){
        System.out.print("아이디를 입력하세요 : ");
        int inputId = scanner.nextInt();
        return inputId;
    }
}
