import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class Settings {

    @BeforeTest
    public void setup() {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua");
    }

    @AfterTest
    public void tearDown() {
        closeWebDriver();
    }

}
