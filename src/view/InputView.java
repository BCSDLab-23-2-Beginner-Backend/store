package view;

import App.Main;
import model.User;

import java.util.Scanner;

public class InputView {
    public int inputUserId() {
        System.out.print("아이디를 입력하세요 : ");
        return Main.scanner.nextInt();
    }
}
