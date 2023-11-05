package Model;

import java.time.LocalDate;

public class AgeCalculator {

        public boolean isUnderAge(LocalDate birth) {
            LocalDate now = LocalDate.now();
            return getAge(birth)-(isOverBirthDay(now,birth)?0:1)<20;
        }

        public int getAge(LocalDate birth) {
            LocalDate now = LocalDate.now();
            return now.getYear() - birth.getYear()+1;
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
