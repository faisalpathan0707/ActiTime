package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValue  // give the respective attribute value 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			 System.setProperty("Webdriver.Chrome.driver","/.Driver.Chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.actitime.com/login.do");
			 String ele = driver.findElement(By.id("username")).getAttribute("id");
			 System.out.println(ele);	
		}
}
