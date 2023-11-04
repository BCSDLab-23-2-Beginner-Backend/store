package controller;

import model.UserRepository;
import model.User;
import model.AgeCalculator;
import view.InputView;
import view.OutputView;


public class AgeCalculatorController {
    public static void main(String[] args) {
        int id = InputView.getIn();
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(id);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        if (isBirthDay) {
            OutputView.printBirthday(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        OutputView.printIsAdult(isUnderAge);
    }
}
