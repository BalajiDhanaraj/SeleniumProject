package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSetup extends ReadProperties {
    public static WebDriver driver;

    public DriverSetup() {
    }

    public static void invokeBrowsers(String browserName, String url) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/SeleniumProject/test config/chromedriver");
            driver = new ChromeDriver();
        }
//        else if (browserName.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/test_drivers/geckodriver");
//            driver = new FirefoxDriver();
//        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                // Deprected implicitlyWait(10L, TimeUnit.SECONDS);
        driver.get(url);
    }
}
