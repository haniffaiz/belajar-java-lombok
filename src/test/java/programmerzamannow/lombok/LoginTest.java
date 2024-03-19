package programmerzamannow.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {

        var login1 = Login.createEmpty();
        var login2 = Login.create("hanif", "rahasia");

        Assertions.assertEquals("hanif", login2.getUsername());
        Assertions.assertEquals("rahasia", login2.getPassword());


    }

    @Test
    void testToString() {

        var login2 = Login.create("hanif", "rahasia");

        System.out.println(login2);


    }
}
