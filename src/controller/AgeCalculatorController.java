package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

import java.time.LocalDate;

public class AgeCalculatorController {
    public static void main(String[] args) {
        //입력
        InputView inputView = new InputView();
        int input = inputView.get();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(input);
        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate birth = user.getBirth();
        String name = user.getName();
        int age = ageCalculator.getAge(birth);
        boolean isBirthDay = ageCalculator.isBirthDay(birth);
        boolean isUnderAge = ageCalculator.isUnderAge(birth);

        //출력
        OutputView outputView = new OutputView();
        outputView.nameAge(name, age, isBirthDay, isUnderAge);
    }
}
