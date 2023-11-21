  
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

//  //Choose your preferred country.
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

  Thread.sleep(1000);

  //Confirm Cities belongs to Country is loaded
  WebElement select_city = driver.findElement(By.xpath("//*[@id='j_idt87:city_label']//following-sibling::div//span"));
    select_city.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    List<WebElement> cities = driver.findElements(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']/ul[@id='j_idt87:city_items']/li"));
    for(WebElement selcity:cities){
      if (selcity.getText().equals("Chennai")){
        selcity.click();
        break;
      }
    }

  //Choose the Course
  WebElement coursebtn = driver.findElement(By.xpath("//*[@aria-label='Show Options']/span[1]"));
  coursebtn.click();
  List<WebElement> listcourse= driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
  for (WebElement lists:listcourse){
    if (lists.getText().equals("AWS"));
        lists.click();
        break;
  }


//  //Choose language randomly
    WebElement rand = driver.findElement(By.xpath("//*[@id='j_idt87:lang']/div[3]/span"));
    rand.click();
    List<WebElement> lang = driver.findElements(By.xpath("//*[@id='j_idt87:lang_items']/li"));
    for (WebElement langlist:lang){
      if (langlist.getText().contains("Tamil")){
        langlist.click();
        break;
      }
    }

    Thread.sleep(1000);
  
  //Select 'Two' irrespective of the language chosen

    WebElement clickbtn = driver.findElement(By.xpath("//*[@id='j_idt87:value']/div[3]"));
    clickbtn.click();

    List<WebElement> two = driver.findElements(By.xpath("//*[@id='j_idt87:value_items']/li"));
    for (WebElement twointamil : two){
      if (twointamil.getText().contains("இரண்டு")){
        twointamil.click();
        break;
      }
    }

  }
  }
