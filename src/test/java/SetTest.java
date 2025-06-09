import helpers.SampleData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private static String[] languages;

    @BeforeAll
    static void setUp() {
        languages = SampleData.getTechnologies();
    }

    /**
     * Тестирование множества с использованием Hamcrest.
     * Проверяет, что множество содержит указанные технологии: ".net Core" и "TypeScript".
     */
    @Test
    void testSetWithHamcrest() {
        Set<String> set = createTestSet();
        assertThat(set, hasItems(".net Core", "TypeScript"));
    }

    /**
     * Тестирование множества с использованием AssertJ.
     * Проверяет, что множество содержит технологии: "Java" и "ReactJS".
     */
    @Test
    void testSetWithAssertJ() {
        Set<String> set = createTestSet();
        assertThat(set).contains("Java", "ReactJS");
    }

    private Set<String> createTestSet() {
        return new HashSet<>(Arrays.asList(languages));
    }
}



