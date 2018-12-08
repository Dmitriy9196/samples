import lombok.Getter;
import lombok.extern.java.Log;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

@Log
public class MainPage {

    @Getter
    private static MainPage mainPage = new MainPage();

    @Name("Поиск")
    @FindBy(name = "q")
    private HtmlElement search;

    public MainPage() {
        HtmlElementLoader.populate(this, Driver.getDriver());
    }

    public MainPage searchSomeThing(final String value) {
        search.clear();
        search.sendKeys(value);
        return this;
    }

    public String getSearchValue() {
        return search.getAttribute("value");
    }
}
