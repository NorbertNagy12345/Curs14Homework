import org.assertj.core.api.Assertions;
import org.example.Person;
import org.junit.Test;

public class PersonTest {
    @Test
    public void personNameIsValid(){
        String name1 = "****";
        String name2 = null;
        String name3 = "Mihai";
        int age = 30;
        Person person = new Person(name1,age);
        Person person1 = new Person(name2,age);
        Person person2 = new Person(name3,age);

        Assertions.assertThat(person.getName()).isNull();
        Assertions.assertThat(person1.getName()).isNull();
        Assertions.assertThat(person2.getName()).isNotEmpty();
    }

    @Test
    public void personAgeIsValid(){
        String name = "Mihai";
        int age1 = -1;
        int age2 = 150;
        int age3 = 34;

        Person person = new Person(name,age1);
        Person person1 = new Person(name,age2);
        Person person2 = new Person(name,age3);

        Assertions.assertThat(person.getAge()).isEqualTo(0);
        Assertions.assertThat(person1.getAge()).isEqualTo(0);
        Assertions.assertThat(person2.getAge()).isEqualTo(34);

    }

}
