
package main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverSetup;
import utils.ReadProperties;

import java.util.List;


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
Boolean ver = verify.isEnabled();
System.out.println(ver);

//
//Select Multiple
WebElement multi = driver.findElement(By.xpath("//*[@id='j_idt87:multiple']/div[3]/span"));
multi.click();

Thread.sleep(500);
List<WebElement> ls_coun = driver.findElements(By.xpath("//*[@id='j_idt87:multiple_panel']/div/ul/li/div/div[2]"));

int count = ls_coun.size();
System.out.println(count);

for (int i=0 ; i<ls_coun.size();i++){
    if (i<2){
        WebElement ls = ls_coun.get(i);
        ls.click();
    }
}

}
}

