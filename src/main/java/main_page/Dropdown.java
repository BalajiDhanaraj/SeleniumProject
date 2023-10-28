  
  package main_page;
  
  import org.openqa.selenium.By;
  import org.openqa.selenium.Dimension;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.interactions.Actions;
  import org.openqa.selenium.support.Color;
  import org.openqa.selenium.support.PageFactory;
  import org.openqa.selenium.support.ui.Select;
  import test_pom.ButtonPom;
  import utils.DriverSetup;
  import utils.ReadProperties;
  
  import java.time.Duration;
  import java.util.List;
  import java.util.ListIterator;
  
  import static org.openqa.selenium.support.Color.fromString;
  
  
  public class Dropdown extends DriverSetup {
  
  
  
  public static void main(String[] args) throws InterruptedException {
  
  //Which is your favorite UI Automation tool?
  Select tools = new Select(driver.findElement(By.className("ui-selectonemenu")));
  tools.selectByVisibleText("Selenium");
  
  //Choose your preferred country.
  Select pref = new Select(driver.findElement(By.name("Select Country")));
  pref.selectByValue("India");
  
  //Confirm Cities belongs to Country is loaded
  Select city = new Select(driver.findElement(By.xpath("//*[@id='j_idt87:city_input']")));
  city.selectByValue("Select City");
  
  //Choose the Course
  WebElement course = driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']//ul/li"));
  course.sendKeys("maven");
  
  //Choose language randomly
  Select rand = new Select(driver.findElement(By.xpath("//*[@id='j_idt87:lang_input']/*")));
  rand.selectByIndex(2);
  
  //Select 'Two' irrespective of the language chosen

    

  
  }
  
  }
