package sychronizationForExplicitWait;

import java.awt.Scrollbar;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {
	
	public static WebElement explicitWait(WebDriver driver,int sec, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}
	public static void main(String[] args)
	{
		ChromeOptions co= new ChromeOptions();
		co.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Denim jeans", Keys.ENTER);
		
		//Clicking on second element after search
		WebElement element= driver.findElement(By.xpath("(//div[contains(@class,'product-imageSliderContainer')])[2]"));
		explicitWait(driver, 30, element).click();
		
		//Getting parent window address
		String parent= driver.getWindowHandle();
		
		//getting all windows address
		Set<String> allHandles = driver.getWindowHandles();
		
		//Switching the controls to another window
		for(String wh: allHandles)
		{
			if(!parent.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and (text()='30')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter pincode')]")).sendKeys("800002", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		
		driver.findElement(By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']")).click();
		
		
		WebElement remove=driver.findElement(By.xpath("//button[text()='REMOVE']"));
		je.executeScript("window.scrollTo(arguments[0],arguments[1])", remove.getLocation().x,remove.getLocation().y);
		remove.click();
		
		driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")).click();
		//driver.quit();
	}
}
