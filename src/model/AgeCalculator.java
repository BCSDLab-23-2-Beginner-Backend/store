package model;

import java.time.LocalDate;
public class AgeCalculator {

    public boolean isUnderAge(LocalDate birth) {
        int age = getAge(birth);
        return age < 20;
    }

    public int getAge(LocalDate birth) {
        LocalDate now = LocalDate.now();

        int age = now.getYear() - birth.getYear() + 1;
        // age += isOverBirthDay(now, birth) ? 1 : 0;
        return age;
    }



    public boolean isBirthDay(LocalDate birth) {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == birth.getMonthValue() && now.getDayOfMonth() == birth.getDayOfMonth();
    }
}