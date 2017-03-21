package Project.maven;

//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Usage;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String [] args){
		
		 WebElement element1;
		    WebDriver driver;
	System.setProperty("webdriver.chrome.driver","chromedriver"); 
	
	driver = new ChromeDriver();	
	
	driver.get(Usage.url);
	
	 element1 = driver.findElement(By.id("lst-ib"));
	element1.sendKeys("Neha Garg");
	driver.close();
	}
}
