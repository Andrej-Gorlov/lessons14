package helpers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleData {
    public static String[] getTechnologies() {
        return new String[]{".net Core", "Java", "JavaScript", "ReactJS", "TypeScript"};
    }

    public static List<Person> getPersonList() {
        return Arrays.asList(
                new Person("Андрей", 33),
                new Person("Николай", 33),
                new Person("Сергей", 5)
        );
    }
}
