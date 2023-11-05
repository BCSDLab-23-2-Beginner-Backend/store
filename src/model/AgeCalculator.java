package model;

import java.time.LocalDate;

public interface AgeCalculator {
    boolean isUnderAge(LocalDate birth);
    int getAge(LocalDate birth);
    boolean isBirthDay(LocalDate birth);
}
