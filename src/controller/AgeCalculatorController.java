package controller;

import model.*;
import view.*;

public class AgeCalculatorController {
    private UserRepository userRepository;
    private AgeCalculator ageCalculator;
    private OutputView outputView;

    public AgeCalculatorController(UserRepository userRepository, AgeCalculator ageCalculator, OutputView outputView) {
        this.userRepository = userRepository;
        this.ageCalculator = ageCalculator;
        this.outputView = outputView;
    }

    public void processUserAge(int inputId) {
        User user = userRepository.findById(inputId);

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        outputView.printUserInfo(user.getName(), age);

        if (isBirthDay) {
            outputView.printBirthdayMessage(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        if (isUnderAge) {
            outputView.printUnderAgeMessage();
        } else {
            outputView.printAdultMessage();
        }
    }

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        UserRepository userRepository = new UserRepository();
        AgeCalculator ageCalculator = new AgeCalculator();
        AgeCalculatorController controller = new AgeCalculatorController(userRepository, ageCalculator, outputView);

        int inputId = inputView.getInputId();
        controller.processUserAge(inputId);
    }
}
