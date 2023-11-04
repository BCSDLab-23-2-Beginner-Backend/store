package controller;
import model.*;
import view.*;

public class AgeCalculatorController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final AgeCalculator ageCalculator = new AgeCalculator();
    private final UserRepository userRepository = new UserRepository();

    public void action(){
        outputView.inputView();
        User user = userRepository.findById(inputView.getId());
        int age = ageCalculator.getAge(user.getBirth());

        outputView.infoView(user.getName(), age);
        if(ageCalculator.isBirthDay(user.getBirth())) outputView.birthdayView(age);
        if(ageCalculator.isUnderAge(user.getBirth())) outputView.underAgeView();
        else outputView.upperAgeView();
    }
}
