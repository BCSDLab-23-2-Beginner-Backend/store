package view;

import model.User;

public class OutputUser {
    public void outputView(User user, int age, boolean isBirthday, boolean isUnderAge){
        System.out.println(user.getName() + "(" + age + ")");
        if(isBirthday) System.out.printf("%d번째 생일을 축하합니다.\n", age);
        if(isUnderAge) System.out.println("미성년자입니다.");
        else System.out.println("성인입니다.");
    }
}
