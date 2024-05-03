package lesson22.classWork22.user22;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserTest {

    private String okEmail = "example@mail.com";
    private String notOklEmail = "examplemail.com";
    private String okPassword = "qwerty1234";
    private String notOkPassword = "qwerty";

    @Test
    public void testSetEmail() {
        User user = new User(okEmail, okPassword);
        Assertions.assertEquals(okEmail, user.getEmail());

        user = new User(notOklEmail, okPassword);
        Assertions.assertNull(user.getEmail());
    }
    @Test
    public void testSetPassword() {
        User user = new User(okEmail, okPassword);
        Assertions.assertEquals(okPassword, user.getPassword());

        user = new User(okEmail, notOkPassword);
        Assertions.assertNull(user.getPassword());
    }
}
