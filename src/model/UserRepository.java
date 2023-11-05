package model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static int sequence = 0;
    private static Map<Integer, AgeSimulation02.User> users = new HashMap<>();
    public UserRepository() {
        users.put(++sequence, new AgeSimulation02.User("홍길동", LocalDate.of(1990, 1, 1)));
        users.put(++sequence,
                new AgeSimulation02.User("박한수", LocalDate.of(2000, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth())));
        users.put(++sequence, new AgeSimulation02.User("강호동", LocalDate.of(2005, 6, 1)));
    }

    public AgeSimulation02.User save(AgeSimulation02.User user) {
        users.put(++sequence, user);
        return user;
    }

    public AgeSimulation02.User findById(int id) {
        return users.get(id);
    }
}
