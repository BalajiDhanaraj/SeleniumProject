package main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Testpage {
    public static WebDriver driver;
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/SeleniumProject/test config/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'txtUsername')]"));
        username.sendKeys("Balaji ");


        driver.close();

    }

}
