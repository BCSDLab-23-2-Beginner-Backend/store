package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;


public class AgeCalculatorController {
    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator();
        UserRepository userRepository = new UserRepository();
        InputView inPutView = new InputView();
        OutputView outPutView = new OutputView();

        int inputId = inPutView.getInputId();
        User user = userRepository.findById(inputId);

        int age = ageCalculator.getAge(user.getBirth());
        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        outPutView.displayUserInfo(user.getName(), age, isBirthDay, isUnderAge);
    }
}
