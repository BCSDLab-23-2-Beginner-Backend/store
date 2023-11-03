package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public AgeCalculatorController(){
        //유저 입력
        User user = userRepository.findById(inputView.InputID());

        //유저 상세 정보
        String name = user.getName(); //유저 이름
        int age = ageCalculator.getAge(user.getBirth()); //유저 나이
        Boolean isBirthday = ageCalculator.isBirthDay(user.getBirth()); //유저 생일 여부
        Boolean isUnderAGe = ageCalculator.isUnderAge(user.getBirth()); //유저 성인 여부

        //출력
        outputView.showOutputView(name,age,isBirthday,isUnderAGe);
    }

    UserRepository userRepository = new UserRepository();
    AgeCalculator ageCalculator = new AgeCalculator();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
}
