import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestTemplate;

import java.util.function.Supplier;

public class MainPageTest extends AbstractTestClass {

    @BeforeAll
    static void setUp() {
        Driver.openGoogle();
    }

    @TestTemplate
    void login(final Supplier<String> context) {
        String some = context.get();
        mainPage.searchSomeThing(some);
        Assertions.assertEquals(some, mainPage.getSearchValue());
    }
}
