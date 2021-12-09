package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        User user = User.builder()
                .firstName("Bogdan")
                .lastName("Bryk")
                .age(30)
                .occupation("UCU")
                .occupation("Nora Bobra")
                .build();
        String expRes = "User(firstName=Bogdan, lastName=Bryk, occupations=[UCU, Nora Bobra], gender=null, age=30, weight=0)";
        assertEquals(user.toString(), expRes);
    }

    @Test
    void builder() {
    }
}