package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
   private List<Person> persons = new ArrayList<>();

   public void add(Person person) {
      this.persons.add(person);
   }

   public List<String> getNumber(String key) {
      return persons.stream()
              .filter(s -> s.getSurname().equals(key))
              .map(Person::getPhoneNumber)
              .collect(Collectors.toList());
   }
}
