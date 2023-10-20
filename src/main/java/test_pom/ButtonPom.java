package test_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPom {

    public static WebElement clickConform(WebDriver driver){
        return driver.findElement(By.name(""));
    }

    @FindBy(name = "password")
    public static WebElement password;



}
