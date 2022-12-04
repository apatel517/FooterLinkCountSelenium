import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriverWait wait = new WebDriverWait(driver,50);
	   System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ebay.com/");
	   System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	   System.out.println(footerdriver.findElements(By.tagName("a")).size());
	   WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	   System.out .println(columndriver.findElements(By.tagName("a")).size());
	   driver.close();
        	 
      
         }
	}

