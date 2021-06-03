package collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {
        "one", "two", "one",  "three", "four", "two", "one", "five",
        "six", "five", "one", "three", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "ten", "one", "thirteen", "fourteen"
        };
        Main main = new Main();
        main.uniqueName(words);
    }

    public void uniqueName(String[] arr) {
        List<String> rsl = Arrays.asList(arr);
        rsl.stream()
                .distinct()
                .forEach(System.out::println);

        Set<String> printed = new HashSet<>();
        for (String s : rsl) {
            if (printed.add(s)) {
                System.out.println("Word: " + s + " meets " + Collections.frequency(rsl, s));
            }
        }
    }
}
