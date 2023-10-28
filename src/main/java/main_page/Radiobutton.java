package main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
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


public class Radiobutton extends DriverSetup {



public static void main(String[] args) throws InterruptedException {

//Your most favorite browser
WebElement fav = driver.findElement(By.xpath("//*[@id='j_idt87:console1:1']"));
fav.click();

//UnSelectable
WebElement unselect = driver.findElement(By.xpath("//*[@id='j_idt87:console1:1']"));
unselect.click();
  
//Find the default select radio button
WebElement def = driver.findElement(By.xpath("//*[@id='j_idt87:console2:2']"));
def.click();

//Select the age group (only if not selected)
WebElement age = driver.findElement(By.xpath("//*[@id='j_idt87:age']//*[@class='ui-helper-hidden-accessible']//input[@type='radio']"));
age.click();


}
}

