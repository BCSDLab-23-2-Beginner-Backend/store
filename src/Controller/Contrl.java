package Controller;

import View.Output_view;
import model.AgeCalculator;
import model.User;
import model.UserRepository;

import static View.Input_view.getInputId;

public class  Contrl {
    public static void extracted() {
        int inputId = getInputId();

        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(inputId);
        AgeCalculator ageCalculator = new AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());


        Output_view.extracted(isBirthDay, age, user.getName());

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());

        Output_view.extract(isUnderAge);
    }


}
