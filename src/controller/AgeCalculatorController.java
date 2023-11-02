package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public static void main(String[] args) {
        int inputId = new InputView().inputId();
        OutputView outputView = new OutputView();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthday(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        outputView.printNameAge(user.getName(), age);

        if(isBirthDay) {
            outputView.printBirthday(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        outputView.printIsUnderAge(isUnderAge);
    }
}
