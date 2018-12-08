import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    @Getter
    private static WebDriver driver = setInstance();

    private static WebDriver setInstance() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
        return driver;
    }

    public static void openVk() {
        driver.get("https://vk.com/");
    }

    public static void openGoogle() {
        driver.get("https://www.google.ru/");
    }

}