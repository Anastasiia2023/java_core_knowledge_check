import java.time.Month;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public static List<Integer> test(String substring) {
       return Stream.of(Month.values()).map(Month::name)
               .filter(name -> name.contains(substring.toUpperCase(Locale.ROOT)))
               .map(String::length)
               .distinct()
               .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(test("J"));
        System.out.println(test("S"));
    }
}
