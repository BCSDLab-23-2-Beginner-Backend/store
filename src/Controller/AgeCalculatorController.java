package Controller;

import Model.AgeCalculator;
import Model.User;
import Model.UserRepository;
import View.InputView;
import View.OutputView;

public class AgeCalculatorController {
    public static void main(String[] args) {
        int id = new InputView().inputId(); // inputview에서 아이디 받기
        UserRepository userRepository = new UserRepository(); // userRepository 생성
        OutputView outputView = new OutputView(); // Outputview 생성
        User user = userRepository.findById(id); // id에 따라 User 정보 가져와 저장
        AgeCalculator ageCalculator = new AgeCalculator(); // AgeCalculator 생성

        int age = ageCalculator.getAge(user.getBirth());
        outputView.PrintUserNameAge(user.getName(), age);

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        if(isBirthDay)
            outputView.PrintUserBirthday(age);

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        outputView.PrintUserUnderAge(isUnderAge);
    }
}
