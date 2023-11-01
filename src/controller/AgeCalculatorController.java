package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;


public class AgeCalculatorController {

    public static void main(String[] args) {

        int id = InputView.inputId();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(id);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        OutputView.printUserNameAge(user.getName(), age);

        if (isBirthDay) {
            OutputView.printBirthday(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        OutputView.printIsAdult(isUnderAge);
    }
}
