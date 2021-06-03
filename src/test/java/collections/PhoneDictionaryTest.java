package collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFind1NumberPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Fedorov", "534872")
        );
        phones.add(
                new Person("Ivanov", "534987")
        );
        List<String> persons = phones.getNumber("Ivanov");
        assertThat(persons.get(0), is("534987"));
    }

    @Test
    public void whenFind2NumberPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Fedorov", "534872")
        );
        phones.add(
                new Person("Ivanov", "534987")
        );
        phones.add(
                new Person("Ivanov", "326598")
        );
        List<String> persons = phones.getNumber("Ivanov");
        assertThat(persons.get(1), is("326598"));
    }
}