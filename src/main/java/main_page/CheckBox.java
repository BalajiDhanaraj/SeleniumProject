
package main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import test_pom.ButtonPom;
import utils.DriverSetup;
import utils.ReadProperties;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import static org.openqa.selenium.support.Color.fromString;


public class CheckBox extends DriverSetup {

public static void main(String[] args) throws InterruptedException {
    ReadProperties.ConfigFileReader();
//Basic Checkbox

WebElement basic = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//following-sibling::div"));
    basic.click();

//Notification
WebElement notify = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//following-sibling::div"));
notify.click();

//Choose your favorite language(s)
List<WebElement> lang = driver.findElements(By.xpath("//*[@id='j_idt87:basic']//following-sibling::div"));
    for (WebElement langs : lang){
        langs.click();
        break;
    }


//Tri State Checkbox
WebElement tri = driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']//following-sibling::div"));
tri.click();
tri.click();


//Toggle Switch
WebElement toggle = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt100']//following-sibling::div"));
toggle.click();

//Verify if check box is disabled
WebElement verify = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt102_input']"));
verify.isEnabled();
//
////Select Multiple
//WebElement multi = driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']//li"));
//multi.click();

 
}
}
