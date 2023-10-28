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


public class Hyperlinks extends DriverSetup {

  


public static void main(String[] args) throws InterruptedException {

//Take me to dashboard
WebElement dash = driver.findElement(By.linkText("Go to Dashboard"));
dash.click();

//Find my destination
WebElement fav = driver.findElement(By.linkText("Find the URL without clicking me."));
fav.click();


//Am I broken link?
WebElement broken = driver.findElement(By.linkText("Broken?"));
broken.click();

//Duplicate Link


//Count Links



//Count Layout Links

  
}
}
