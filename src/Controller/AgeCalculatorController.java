package Controller;

import model.UserRepository;
import model.AgeCalculator;
import model.User;
import view.InputView;
import view.OutputView;
public class AgeCalculatorController {
    private AgeCalculator ageCalculator;
    private InputView inputView;
    private OutputView outputView;

    public AgeCalculatorController(AgeCalculator ageCalculator, InputView inputView, OutputView outputView){
        this.ageCalculator = ageCalculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }
    public void Controller(){
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputView.InputId());
        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());
        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        outputView.OutputUser(user, age, isBirthDay, isUnderAge);
    }

    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        AgeCalculatorController ageCalculatorController = new AgeCalculatorController(ageCalculator, inputView, outputView);
        ageCalculatorController.Controller();
    }

}
