package programmerzamannow.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructorNull() {

        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member(null,null);
        });
    }

    @Test
    void testSetterNull() {

        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member("Hanif","Hanif");
            member.setName(null);
        });
    }

    @Test
    void testMethodNull() {

        Assertions.assertThrows(NullPointerException.class,()->{
            var member = new Member("Hanif","Hanif");
            member.sayHello(null);
        });
    }
}
