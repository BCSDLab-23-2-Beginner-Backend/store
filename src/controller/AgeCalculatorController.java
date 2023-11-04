package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        int input = inputView.get();

        OutputView outputView = new OutputView();
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(input);
        AgeCalculator ageCalculator = new AgeCalculator();

        outputView.nameAge(user, ageCalculator);

    }
}
