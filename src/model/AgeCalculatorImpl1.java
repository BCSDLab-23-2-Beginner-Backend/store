package model;

import java.time.LocalDate;

public class AgeCalculatorImpl1 implements AgeCalculator{
    public boolean isUnderAge(LocalDate birth) {
        int age = getAge(birth);
        return age < 19;
    }

    public int getAge(LocalDate birth) {
        LocalDate now = LocalDate.now();

        int age = now.getYear() - birth.getYear();
        return age;
    }

    public boolean isBirthDay(LocalDate birth) {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == birth.getMonthValue() && now.getDayOfMonth() == birth.getDayOfMonth();
    }
}