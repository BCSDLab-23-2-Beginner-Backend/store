package model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static int sequence = 0;
    private static Map<Integer, User> users = new HashMap<>();

    public UserRepository() {
        users.put(++sequence, new User("홍길동", LocalDate.of(1990, 1, 1)));
        users.put(++sequence,
                new User("박한수", LocalDate.of(2000, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth())));
        users.put(++sequence, new User("강호동", LocalDate.of(2005, 6, 1)));
    }

    public User save(User user) {
        users.put(++sequence, user);
        return user;
    }

    public User findById(int id) {
        return users.get(id);
    }
}
