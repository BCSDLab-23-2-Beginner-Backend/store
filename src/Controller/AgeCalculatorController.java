package Controller;

import Model.AgeCalculator;
import Model.User;
import Model.UserRepository;
import View.InputView;
import View.OutputView;

public class AgeCalculatorController {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        int inputId = new InputView().InputID();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();
        OutputView outputView = new OutputView();

        outputView.printNameAge(user.getName(),ageCalculator.getAge(user.getBirth()));
        if (ageCalculator.isBirthDay(user.getBirth()))
            outputView.printBirthDay(ageCalculator.getAge(user.getBirth()));
        outputView.printIsUnderAge(ageCalculator.isUnderAge(user.getBirth()));
    }
}
