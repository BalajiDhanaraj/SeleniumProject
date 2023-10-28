  
  package main_page;
  
  import org.openqa.selenium.By;
  import org.openqa.selenium.Dimension;
  import org.openqa.selenium.JavascriptExecutor;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.interactions.Actions;
  import org.openqa.selenium.support.Color;
  import org.openqa.selenium.support.PageFactory;
  import org.openqa.selenium.support.ui.ExpectedConditions;
  import org.openqa.selenium.support.ui.Select;
  import org.openqa.selenium.support.ui.WebDriverWait;
  import test_pom.ButtonPom;
  import utils.DriverSetup;
  import utils.ReadProperties;

  import javax.swing.text.AttributeSet;
  import javax.swing.text.html.Option;
  import java.time.Duration;
  import java.util.List;
  import java.util.ListIterator;
  
  import static org.openqa.selenium.support.Color.fromString;
  
  
  public class Dropdown extends DriverSetup {
  
  
  
  public static void main(String[] args) throws InterruptedException {

    ReadProperties.ConfigFileReader();

  //Which is your favorite UI Automation tool?
  Select tools = new Select(driver.findElement(By.className("ui-selectonemenu")));
  tools.selectByVisibleText("Selenium");

//  Thread.sleep(5000);

  //Choose your preferred country.
  WebElement pref = driver.findElement(By.xpath("//*[@id='j_idt87:country']//following-sibling::div//span"));
  pref.click();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  List<WebElement> prefsel = driver.findElements(By.xpath("//*[@id='j_idt87:country_items']/li[@data-label]"));
  System.out.println(prefsel);
  for (WebElement sels:prefsel){
    if (sels.getText().equals("India")){
      System.out.println(sels.getText());
      sels.click();
      break;
    }
  }



//  //Confirm Cities belongs to Country is loaded
//  Select city = new Select(driver.findElement(By.xpath("//*[@id='j_idt87:city_input']")));
//  city.selectByValue("Select City");
  
  //Choose the Course
//  WebElement course = driver.findElement(By.xpath("//button[@aria-label='Show Options']"));
//  course.click();
//  WebElement sel = driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//ul//li[2]"));
//  sel.click();
//
//  //Choose language randomly
//    WebElement rand = driver.findElement(By.xpath("//*[@id='j_idt87:lang']//following-sibling::div/*[@id='j_idt87:lang_input']/option[2]"));
//    rand.click();
//  Select rand = new Select(driver.findElement(By.id("j_idt87:lang_input")));
//  rand.selectByIndex(2);
//  rand.selectByIndex(3);

  
  //Select 'Two' irrespective of the language chosen

    

  
  }
  
  }
