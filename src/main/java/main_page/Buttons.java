package main_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import test_pom.ButtonPom;
import utils.DriverSetup;
import utils.ReadProperties;


public class Buttons extends DriverSetup {



public static void main(String[] args){

    ReadProperties.ConfigFileReader();

    PageFactory.initElements(driver, ButtonPom.class);
    ButtonPom.clickConform(driver);



}

}
