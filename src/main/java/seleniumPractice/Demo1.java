package seleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
@Test
public class demo1 {
	public void run() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver83.exe");
WebDriver driver = new ChromeDriver();
driver.get("<a href='http://toolsqa.com/automation-practice-switch-windows/'>http://toolsqa.com/automation-practice-switch-windows/</a>");
WebElement clickElement = driver.findElement(By.id("button1"));
 
for(int i = 0; i < 3; i++)
{
clickElement.click();
Thread.sleep(3000);
}
 

	}		 
		}


}
