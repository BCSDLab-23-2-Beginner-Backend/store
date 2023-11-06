package View;

public class OutputView {
    public static void printAge(String name, int age){
        System.out.println(name + "(" + age + ")");
    }

    public static void printBirthdayCongratulation(int age){
        System.out.printf("%d번째 생일을 축하합니다.\n", age);
    }

    public static void printUnderAge(){
        System.out.println("미성년자입니다.");
    }

    public static void printNotUnderAge(){
        System.out.println("성인입니다.");
    }
}
