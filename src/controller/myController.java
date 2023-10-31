package controller;

import model.AgeCalculator;
import model.User;
import model.UserRepository;
import view.myView;

public class myController {
    int inputId = new myView().getId();

    UserRepository userRepository = new UserRepository();
    User user = userRepository.findById(inputId);
    AgeCalculator ageCalculator = new AgeCalculator();

    boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
    int age = ageCalculator.getAge(user.getBirth());
    boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());


    int b = new myView().checkBirth(user.getName(), isBirthDay, age);
    int i = new myView().checkId(isUnderAge);
}
