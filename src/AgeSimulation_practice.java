import Controller.AgeCalculatorController;
import View.InputView;

public class AgeSimulation_practice {
    public static void main(String[] args) {

        InputView input_view = new InputView();
        input_view.Input_View();

        AgeCalculatorController controller = new AgeCalculatorController();
        controller.call_OutputView();

    }
}