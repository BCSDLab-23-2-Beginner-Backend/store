package controller;

import model.AgeCalculater;
import model.User;
import model.UserRepository;
import view.InputView;
import view.OutputView;

import java.time.LocalDate;

public class AgeCalculaterController {
    private InputView inputView;
    private OutputView outputView;
    private AgeCalculater ageCalculater;
    private UserRepository userRepository;

    public AgeCalculaterController(InputView inputView, OutputView outputView, AgeCalculater ageCalculater, UserRepository userRepository) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.ageCalculater = ageCalculater;
        this.userRepository = userRepository;
    }
    public void controll() {
        User user = userRepository.findById(inputView.inputUserId());
        LocalDate birth = user.getBirth();
        boolean isBirthDay = ageCalculater.isBirthDay(birth);
        boolean isUnderAge = ageCalculater.isUnderAge(birth);
        int age = ageCalculater.getAge(birth);
        outputView.displayUserInfo(user.getName(), age, isUnderAge, isBirthDay);
    }
}
