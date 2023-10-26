
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


public class Buttons extends DriverSetup {



public static void main(String[] args) throws InterruptedException {

//Which is your favorite UI Automation tool?

Select tools = new Select(driver.findElement(By.class("ui-selectonemenu")));
tools.selectByVisibleText("Selenium");

//Choose your preferred country.

Select pref = new Select(driver.findElement(By.name("Select Country")));
pref.selectByValue("India");

//Confirm Cities belongs to Country is loaded

Select city = new Select(driver.findElement(By.xpath("//*[@id='j_idt87:city_input']")));

city.selectByValue("Select City");


























  


}

}
