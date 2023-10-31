package view;

import model.User;

public class OutputView {
    public void showinfo(String name, int age){
        System.out.println(name + "(" + age + ")");
    }

    public void showBirthday(int age){
        System.out.println(age + "번째 생일을 축하합니다.");
    }

    public void showAdult(){
        System.out.println("성인입니다.");
    }

    public void showNotAdult(){
        System.out.println("미성년자입니다.");
    }
}