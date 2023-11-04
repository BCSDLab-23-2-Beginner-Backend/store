package view;

public class OutputView {

    public void inputView(){
        System.out.print("아이디를 입력하세요 : ");
    }

    public void infoView(String name, int age){
        System.out.println(name + "(" + age + ")");
    }

    public void birthdayView(int age){
        System.out.println(age + "번째 생일을 축하합니다.");
    }

    public void underAgeView(){
        System.out.println("미성년자입니다.");
    }

    public void upperAgeView(){
        System.out.println("성인입니다.");
    }
}
