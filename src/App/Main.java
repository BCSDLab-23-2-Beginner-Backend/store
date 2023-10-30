package App;

import controller.AgeCalculaterController;
import model.AgeCalculater;
import model.UserRepository;
import view.InputView;
import view.OutputView;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        AgeCalculater ageCalculater = new AgeCalculater();
        UserRepository userRepository = new UserRepository();
        AgeCalculaterController ageCalculaterController = new AgeCalculaterController(inputView, outputView, ageCalculater, userRepository);
        ageCalculaterController.controll();
        scanner.close();
    }
}
