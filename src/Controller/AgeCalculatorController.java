package Controller;

import Model.AgeCalculator;
import Model.User;
import Model.UserRepository;
import View.OutputView;

import java.util.Scanner;

public class AgeCalculatorController {

    int inputId;
    int age;
    boolean isBirthDay;
    boolean isUnderAge;
    User user;
    UserRepository userRepository = new UserRepository();
    AgeCalculator ageCalculator = new AgeCalculator();


    public AgeCalculatorController(){
        Scanner scanner = new Scanner(System.in);
        this.inputId = scanner.nextInt();
        this.user = userRepository.findById(inputId);
        this.isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        this.isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        this.age = ageCalculator.getAge(user.getBirth());
    }

    public void call_OutputView(){
        OutputView output = new OutputView();
        output.Output_View(this.user.getName(), this.age, this.isBirthDay, this.isUnderAge);
    }
}
