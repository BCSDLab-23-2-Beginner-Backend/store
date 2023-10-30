package model;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate birth;

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
