package src.controller;

import model.*;
import view.*;
public class AgeCalculatorController {
    private AgeCalculator ageCalculator;
    private UserRepository userRepository;
    private InputView inputView;
    private OutputView outputView;
    public AgeCalculatorController(InputView inputView, OutputView outputView, AgeCalculator agecalculator, UserRepository userRepository){
        this.inputView = inputView;
        this.outputView = outputView;
        this.ageCalculator = agecalculator;
        this.userRepository = userRepository;
    }

    public void control() {
        User user = userRepository.findById(inputView.getInputId());
        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());
        String name = user.getName();
        outputView.printUserInfo(name, age, isUnderAge, isBirthDay);
    }
}