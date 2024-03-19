package programmerzamannow.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void createViaConstructor() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Reading");
        hobbies.add("Traveling");

        var person = new Person("id","name", 26,hobbies);

    }

    @Test
    void createViaSetter() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Reading");
        hobbies.add("Traveling");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(26);
        person.setHobbies(hobbies);

    }

    @Test
    void createViaBuilder() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Reading");
        hobbies.add("Traveling");

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(26)
                .hobby("Game")
                .hobby("Reading")
                .hobby("Traveling")
                .build();

        System.out.println(person);
    }
}
