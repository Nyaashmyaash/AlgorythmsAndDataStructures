package structures;

import java.util.function.Predicate;

public class List {
    public static void main(String[] args) {
        User user = new User();
        user.setId(112L);
    }

    static class User {
        long id;

        public void setId(long id) {
            this.id = id;
        }
    }

}

