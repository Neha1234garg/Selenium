package Project.maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import utilities.Usage;

public class AppTest
{
    WebElement element;
    WebDriver driver;
        @Test
        public void testCase()
        {
        	
        	
           Reporter.log("MyName");
        	System.setProperty("webdriver.chrome.driver","chromedriver"); 
        	Reporter.log("Opening Browser");
        	driver = new ChromeDriver();	
        	
    		driver.get(Usage.url);
    		Reporter.log("Getting search tab");
    		WebElement element = driver.findElement(By.id("lst-ib"));
    		Reporter.log("Typing search value");
    		element.sendKeys("Neha Garg");
    		
        }
}