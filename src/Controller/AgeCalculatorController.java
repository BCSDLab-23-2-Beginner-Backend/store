package Controller;
import View.InputView;
import View.OutputView;
import Model.User;
import Model.UserRepository;
import Model.AgeCalculator;

public class AgeCalculatorController {
    public static void main(String[] args) {
        int inputId = InputView.getInputId();
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        int age = ageCalculator.getAge(user.getBirth());
        OutputView.displayUserInfo(user.getName(), age);

        if (ageCalculator.isBirthDay(user.getBirth())) {
            OutputView.displayBirthdayMessage(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        OutputView.displayAgeStatus(isUnderAge);
    }
}

