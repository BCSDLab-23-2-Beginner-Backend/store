package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public AgeCalculatorController(){
        User user = userRepository.findById(inputView.InputID());
        outputView.showinfo(user.getName(), ageCalculator.getAge(user.getBirth()));

        if(ageCalculator.isBirthDay(user.getBirth())){ //생일일때 출력되는 view
            outputView.showBirthday(ageCalculator.getAge(user.getBirth()));
        }

        if(ageCalculator.isUnderAge(user.getBirth())){ //미성년자인지 성인인지 구분해서 출력되는 view
            outputView.showNotAdult();
        } else outputView.showAdult();

    }

    UserRepository userRepository = new UserRepository();
    AgeCalculator ageCalculator = new AgeCalculator();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

}
