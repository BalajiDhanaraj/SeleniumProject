package test_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.DriverSetup.driver;

public class ButtonPom {

    public static WebElement clickConform(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id='j_idt88:j_idt90']"));
    }

    @FindBy(id = "j_idt88:j_idt92")
    public static WebElement Disabled;

    @FindBy(xpath = "//*[@id='j_idt88:j_idt94']/span[2]")
    public static WebElement Position;

    @FindBy(xpath = "//*[@id='j_idt88:j_idt96']/span[2]")
    public static WebElement Color;

    @FindBy(xpath = "//*[@id='j_idt88:j_idt98']/span[2]")
    public static WebElement Size;

    @FindBy(xpath = "//*[@id='j_idt88:j_idt100']")
    public static WebElement ChangeColor;

    @FindBy(xpath = "//*[@id='j_idt88:j_idt102:imageBtn']/span")
    public static WebElement Hidden;

}
