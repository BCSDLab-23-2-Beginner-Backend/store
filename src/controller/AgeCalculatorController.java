package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        int inputId = inputView.getInputId();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        if (isBirthDay) {
            outputView.displayCelebrateMessage(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        outputView.displayUserAgeIdentification(isUnderAge);

    }
}
