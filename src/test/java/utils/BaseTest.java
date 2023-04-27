package utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BaseTest {

	public static WebDriver driver = Config.CreateWebDriver(Config.getBrowserName());
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}
