package View;

import java.util.Scanner;

public class InputView {
    Scanner s = new Scanner(System.in);

    public int inputId() {
        System.out.print("아이디를 입력하세요 : ");
        int user_id = s.nextInt();
        return user_id;
    }
}
