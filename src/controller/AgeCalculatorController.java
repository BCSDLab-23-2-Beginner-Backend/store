package controller;

public class AgeCalculatorController {
    public static void main(String[] args) {
        int inputId = view.InputView.getInputId();

        model.UserRepository userRepository = new model.UserRepository();
        model.User user = userRepository.findById(inputId);
        model.AgeCalculator ageCalculator = new model.AgeCalculator();

        boolean isBirthDay = ageCalculator.isBirthDay(user.getBirth());
        int age = ageCalculator.getAge(user.getBirth());

        view.OutputView.displayUserInfo(user.getName(), age);
        if(isBirthDay){
            view.OutputView.displayBirthdayWish(age);
        }

        boolean isUnderAge = ageCalculator.isUnderAge(user.getBirth());
        view.OutputView.displayAgeStatus(isUnderAge);
    }
}
