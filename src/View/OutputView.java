package View;

public class OutputView {
    public void PrintUserNameAge(String name, int age)
    {
        System.out.println(name + "(" + age + ")");
    }

    public void PrintUserBirthday(int age)
    {
        System.out.println(age + "번째 생일을 축하합니다.");
    }

    public void PrintUserUnderAge(boolean isUnderAge)
    {
        if(isUnderAge)
        {
            System.out.println("미성년자입니다.");
        }
        else
        {
            System.out.println("성인입니다.");
        }
    }
}
