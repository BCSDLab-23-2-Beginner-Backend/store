import controller.AgeCalculatorController;
import controller.SelectCalculatorController;
import model.AgeCalculatorImpl1;
import model.AgeCalculatorImpl2;

public class App {
    public static void main(String[] args) {
//        SelectCalculatorController selectCalculatorController;
        AgeCalculatorController ageCalculatorController = new AgeCalculatorController(new AgeCalculatorImpl2());
        ageCalculatorController.run();
    }
}
