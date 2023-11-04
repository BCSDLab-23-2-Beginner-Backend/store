package agecalculator;

import controller.AgeCalculatorController;

public class Application {
    public static void main(String[] args) {
        AgeCalculatorController controller = new AgeCalculatorController();
        controller.action();
    }
}
