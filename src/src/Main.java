package src;

import controller.*;
import model.*;
import view.*;

public class Main {
    public static void main(String[] args){
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        AgeCalculator ageCalculator = new AgeCalculator();
        UserRepository userRepository = new UserRepository();

        AgeCalculatorController ageCalculatorController = new AgeCalculatorController(inputView, outputView,
                ageCalculator, userRepository);

        ageCalculatorController.control();
    }
}
