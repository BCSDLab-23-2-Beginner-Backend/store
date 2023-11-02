package model;

import java.time.LocalDate;

public class AgeCalculator {

    public boolean isUnderAge(LocalDate birth) {
        int age = getAge(birth);
        return age < 19;
    }

    public int getAge(LocalDate birth) {
        LocalDate now = LocalDate.now();

        int age = now.getYear() - birth.getYear();
        age += isOverBirthDay(now, birth) ? 1 : 0;
        return age;
    }

    private boolean isOverBirthDay(LocalDate now, LocalDate birth) {
        if (now.getMonthValue() != birth.getMonthValue())
            return now.getMonthValue() > birth.getMonthValue();
        return now.getDayOfMonth() > birth.getDayOfMonth();
    }

    public boolean isBirthDay(LocalDate birth) {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == birth.getMonthValue() && now.getDayOfMonth() == birth.getDayOfMonth();
    }
}
