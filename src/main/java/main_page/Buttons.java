package main_page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import test_pom.ButtonPom;
import utils.DriverSetup;
import utils.ReadProperties;

import javax.swing.*;
import java.time.Duration;

import static org.openqa.selenium.support.Color.fromString;


public class Buttons extends DriverSetup {



public static void main(String[] args) throws InterruptedException {

    // reading the config file and invoke the driver chrome
    ReadProperties.ConfigFileReader();

    // Initial the pom class and call the static method(initElements) access the webelements of button class
    PageFactory.initElements(driver, ButtonPom.class);

    //Click and Confirm title.
    //ButtonPom.clickConform(driver).click();

    //Confirm if the button is disabled.
    Boolean dis = ButtonPom.Disabled.isDisplayed();
     if (dis.equals(true)){
         System.out.println("true");
     }else {
         System.out.println("false");
     }

     //Find the position of the Submit button
     String Location  = String.valueOf(ButtonPom.Position.getLocation());
     System.out.println(Location);

     //Find the Save button color
     Color color = fromString(ButtonPom.Color.getCssValue("color"));
     //Color color = Color.fromString(ButtonPom.Color.getAttribute("color"));
     System.out.println(color);

     //Find the height and width of this button
      Dimension sizes = ButtonPom.Size.getSize();
      System.out.println(sizes);

     //Mouse over and confirm the color changed

        WebElement changebtn = ButtonPom.ChangeColor;
        Color firstcolors = Color.fromString(ButtonPom.ChangeColor.getCssValue("background-color"));
        System.out.println(firstcolors);
         Actions actions = new Actions(driver);
         actions.moveToElement(changebtn);
         actions.build().perform();

        Color secondcolors = Color.fromString(ButtonPom.ChangeColor.getCssValue("background-color"));
        System.out.println(secondcolors);

        if (firstcolors.equals(secondcolors)){
             System.out.println("no change in color"+firstcolors+secondcolors);
         }else {
             System.out.println("change in color"+firstcolors+secondcolors);
         }


        //Click Image Button and Click on any hidden button
        ButtonPom.Hidden.click();
        //Thread.sleep(100);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        ButtonPom.Hiddenbtn.click();

        //How many rounded buttons are there?
        WebElement round = ButtonPom.Roundbtn;



    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
   // driver.close();

}

}
