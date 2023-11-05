package Model;

import java.time.LocalDate;

public class User {
    private final String name;
    private final LocalDate birth;

    public User(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }
}