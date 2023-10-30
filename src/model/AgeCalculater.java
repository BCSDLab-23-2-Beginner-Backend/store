package model;

import java.time.LocalDate;

public class AgeCalculater {
    public boolean isUnderAge(LocalDate birth) {
        LocalDate now = LocalDate.now();
        int age = getAge(birth);
        return age < 20;
    }
    public int getAge(LocalDate birth) {
        LocalDate now = LocalDate.now();
        int age = now.getYear() - birth.getYear() + 1;
        return age;
    }
    public boolean isBirthDay(LocalDate birth) {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() == birth.getMonthValue() && now.getDayOfMonth() == birth.getDayOfMonth();
    }
}
