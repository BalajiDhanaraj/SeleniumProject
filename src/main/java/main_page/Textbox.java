package main_page;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Textbox {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/SeleniumProject/test config/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.get("https://www.leafground.com/input.xhtml");

        //type your name
        WebElement username = driver.findElement(By.xpath("//*[@placeholder='Babu Manickam']"));
        username.sendKeys("Balaji D");

        //append country to this city
        WebElement city = driver.findElement(By.xpath("//*[@value='Chennai']"));
        city.sendKeys(", India");

        //Verify if text box is disabled
        Boolean textdis = driver.findElement(By.ById.id("j_idt88:j_idt93")).isEnabled();
        if (textdis.equals(true)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        //Clear the typed text.
        WebElement clear = driver.findElement(By.name("j_idt88:j_idt95"));
        clear.clear();

        //Retrieve the typed text.
        WebElement retriv = driver.findElement(By.id("j_idt88:j_idt97"));
        String retrivevalue = retriv.getAttribute("value");
        Assert.assertEquals("My learning is superb so far.",retriv.getAttribute("value"));
//      Assertions.assertEquals("SeleniumSelenium!", textField.getAttribute("value"));
        System.out.println(retrivevalue);

        //Type email and Tab. Confirm control moved to next element.
        WebElement emailandtab = driver.findElement(By.name("j_idt88:j_idt99"));
        emailandtab.sendKeys("balajiwalker33@gmail.com");
        Actions action = new Actions(driver);
        action.keyDown(Keys.TAB).build().perform();

//        //text editor
//        WebElement edit = driver.findElement(By.xpath("//*[@class='ql-editor ql-blank']"));
//        edit.sendKeys("balaji");
//        Actions actionsedit = new Actions(driver);
//        actionsedit.keyDown(Keys.CONTROL)
//                        .keyDown(Keys.valueOf("a"))
//                                .keyUp(Keys.valueOf("a"))
//                                        .keyUp(Keys.CONTROL).build().perform();


        //Just Press Enter and confirm error message*
        WebElement press2 = driver.findElement(By.id("j_idt106:thisform:age"));
        press2.click();
        Actions press = new Actions(driver);
        press.keyDown(Keys.ENTER).build().perform();

        WebElement errormsg = driver.findElement(By.xpath("//*[@id='j_idt106:thisform:j_idt110']//span[last()]"));
        Boolean msg = errormsg.isDisplayed();
        System.out.println(msg);


        //Click and Confirm Label Position Changes
        WebElement lable = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
        lable.click();
        String location = String.valueOf(lable.getLocation());
        System.out.println(location);

        //Type your name and choose the third option
        WebElement name = driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete']/ul/li/input"));
        name.click();
        name.sendKeys("Balaji");
        //*[@id='j_idt106:auto-complete_panel']/descendant::li[3]
        WebElement selectname = driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_panel']/ul/li[3]"));
        selectname.click();

        //Type your DOB (mm/dd/yyyy) and confirm date chosen
        WebElement date = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt116_input']"));
        date.sendKeys("07/17/1999");
        String month = String.valueOf(driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/*[contains(text(),'July')]")).getText());
        String year = String.valueOf(driver.findElement(By.xpath("//*[@class='ui-datepicker-title']/*[contains(text(),'1999')]")).getText());
        String day= String.valueOf(driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//child::tr[3]/td[7]/a[text()='17']")).getText());

        String dob = month+"/"+day+"/"+year;
        System.out.println(dob);
        String dobcheck = "July/17/1999";
        if (dobcheck.equals(dob)){
            System.out.println("equal");
        }else {
            System.out.println("not");
        }

        WebElement cal = driver.findElement(By.xpath("//*[@aria-label='Show Calendar']"));
        cal.click();
        //Type number and spin to confirm value changed
        WebElement num = driver.findElement(By.name("j_idt106:j_idt118_input"));
        //num.click();
        num.sendKeys("55");

        WebElement spinup = driver.findElement(By.xpath("//*[@name='j_idt106:j_idt118_input']//following::a[1]"));
        spinup.click();

        if(num.getText().equals(spinup.getText())){
            System.out.println("true");
        }else{
            System.out.println("false v");
        }

        //Type random number (1-100) and confirm slider moves correctly
        WebElement slide = driver.findElement(By.name("j_idt106:slider"));
        slide.sendKeys("55");

        WebElement slideno = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt120']//div[contains(@style,text())]"));
        //*[@id='j_idt106:j_idt120']//div[contains(@style,'55')]
        if(slide.getText().equals(slideno.getText())){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }


        //Click and Confirm Keyboard appears

        WebElement click = driver.findElement(By.id("j_idt106:j_idt122"));
        click.click();

        WebElement key = driver.findElement(By.xpath("//*[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
        Boolean trueornot = key.isDisplayed();

        if(trueornot.equals(true)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        WebElement close = driver.findElement(By.xpath("//*[@title='Close the keypad']"));
        close.click();

        //Close the keypad
        //Custom Toolbar

        WebElement custom = driver.findElement(By.xpath("//*[@class='ql-editor ql-blank']/following::p"));
        custom.sendKeys("The editors ");



        //Thread.sleep(6000);
       // driver.close();

    }

}
