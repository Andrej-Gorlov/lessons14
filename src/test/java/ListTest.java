import helpers.SampleData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    private String[] languages;

    @BeforeEach
    void setUp() {
        languages = SampleData.getTechnologies();
    }

    /**
     * Тестирование списка с использованием Hamcrest.
     * Проверяет, что созданный список содержит все языки программирования из массива.
     */
    @Test
    void testListWithHamcrest() {
        List<String> list = createTestList();
        assertThat(list, contains(languages));
    }

    /**
     * Тестирование списка с использованием AssertJ.
     * Проверяет, что созданный список содержит все языки программирования из массива.
     */
    @Test
    void testListWithAssertJ() {
        List<String> list = createTestList();
        assertThat(list).containsExactly(languages);
    }

    private List<String> createTestList() {
        return Arrays.asList(languages);
    }
}
