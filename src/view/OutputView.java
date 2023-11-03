package view;

import model.User;

public class OutputView {
    public void showOutputView(String name, int age, Boolean isBirthday, Boolean isUnderAge){
        System.out.println(name + "(" + age + ")");
        if(isBirthday)
            System.out.println(age + "번째 생일을 축하합니다.");
        if(isUnderAge)
            System.out.println("미성년자입니다.");
        else
            System.out.println("성인입니다.");
    }
}