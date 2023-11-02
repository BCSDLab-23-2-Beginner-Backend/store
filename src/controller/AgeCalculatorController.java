package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

import java.time.LocalDate;

public class AgeCalculatorController {

    public AgeCalculatorController() {
        UserRepository userRepository = new UserRepository();
        AgeCalculator ageCalculator = new AgeCalculator();

        int inputId = new InputView().inputId();
        User user = userRepository.findById(inputId);

        LocalDate birth = user.getBirth();
        int age = ageCalculator.getAge(birth);
        boolean isBirthDay = ageCalculator.isBirthDay(birth);
        boolean isUnderAge = ageCalculator.isUnderAge(birth);

        new OutputView().printInfo(user.getName(), age, isBirthDay, isUnderAge);
    }
}
