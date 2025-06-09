import helpers.Person;
import helpers.SampleData;
import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ObjectTest {
    private List<Person> people;

    @BeforeEach
    void setUp() {
        people = SampleData.getPersonList();
    }

    /**
     * Тестирование списка объектов Person с использованием Hamcrest.
     * Проверяет, что список содержит 3 элемента и что имена соответствуют ожидаемым значениям.
     */
    @Test
    public void testPersonListWithHamcrest() {
        MatcherAssert.assertThat(people, Matchers.hasSize(3));
        MatcherAssert.assertThat(people.get(0).getName(), Matchers.is("Андрей"));
        MatcherAssert.assertThat(people, Matchers.contains(
                Matchers.hasProperty("name", Matchers.is("Андрей")),
                Matchers.hasProperty("name", Matchers.is("Николай")),
                Matchers.hasProperty("name", Matchers.is("Сергей"))
        ));
    }

    /**
     * Тестирование списка объектов Person с использованием AssertJ.
     * Проверяет, что список содержит 3 элемента и что имена соответствуют ожидаемым значениям.
     */
    @Test
    public void testPersonListWithAssertJ() {
        Assertions.assertThat(people).hasSize(3);
        Assertions.assertThat(people.get(0).getName()).isEqualTo("Андрей");
        Assertions.assertThat(people).extracting(Person::getName)
                .containsExactly("Андрей", "Николай", "Сергей");
    }
}
