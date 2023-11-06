package Controller;

import Model.AgeCalculator;
import Model.User;
import Model.UserRepository;
import View.*;

public class AgeCalculatorController {

    public static void main(String[] args) {
        //input-1
        int inputId = InputView.id_in();


        //
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        //output - 1
        //나이 출력 - void age_out()
        OutputView.age_out(user,age);

        //output - 2
        //생일 축하 메세지 - void celebrate(boolean isBirthDay, int age)
        OutputView.celebrate_out(isBirthDay, age);

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        //output - 3
        //성인 여부 판단 - void minzza(boolean isUnderAge)
        OutputView.minzza_out(isUnderAge);

    }
}
