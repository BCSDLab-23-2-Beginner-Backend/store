package Controller;

import Model.*;
import View.*;

public class AgeCalculatorController {
    public static void main(String[] args){
        //InputView inputView = new InputView();
        int inputId = InputView.getId();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        OutputView.printAge(user.getName(), age);
        if(isBirthDay) {
            OutputView.printBirthdayCongratulation(age);
        }
        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        if(isUnderAge){
            OutputView.printUnderAge();
        }
        else{
            OutputView.printNotUnderAge();
        }

    }
}