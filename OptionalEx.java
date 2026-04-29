//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        // Optional is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.

        // Optional is used to avoid null pointer exception. It is a wrapper class which contains a value and provides methods to check if the value is present or not.

        // Optional is a final class which means it cannot be extended. It is a generic class which means it can be used with any type of data.

        // Optional is a part of java.util package.

        // Optional is introduced in java 8.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

       // Optional<String> name = names.stream()
        String name = names.stream()
       //.filter(name -> name.startsWith("A"))
              .filter(str -> str.contains("z"))
                .findFirst()
                .orElse("No name found");

              //  System.out.println(name.orElse("No name found"));
                System.out.println(name);
    }
    
}
