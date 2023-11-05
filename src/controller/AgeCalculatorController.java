package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

public class AgeCalculatorController {
    public AgeCalculatorController(AgeCalculator ageCalculator) {
        this.ageCalculator = ageCalculator;
    }

    AgeCalculator ageCalculator;
    UserRepository userRepository = new UserRepository();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    // Id 입력받기 -> view
    // 사용자 존재 유무 확인 -> model
    // 나이 계산하기 -> model
    // 나이 알려주기 -> view

    public void run(){
        //view에서 Id 입력받기
        int userId = inputView.getID();

        //model에서 사용자 존재 유무 확인하기
        User user = userRepository.findById(userId);

        //model에서 사용자 생일, 나이, 이름, 성인 여부 등의 정보 받아오기
        String name = user.getName();
        int age = ageCalculator.getAge(user.getBirth());
        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        //view로 나이 출력하기
        outputView.printAge(name, age, isBirthDay, isUnderAge);
    }
}
