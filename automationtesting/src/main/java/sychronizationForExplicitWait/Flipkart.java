package sychronizationForExplicitWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	
	public static WebElement explicitWait(WebDriver driver,int sec, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone" , Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> allHandles= driver.getWindowHandles();
		
		for(String wh: allHandles)
		{
			if(!parent.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/div[1]/div[1]/div/ul/li[3]/a/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[6]/div/div[2]/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[1]/div[2]/div/div[2]/div[1]/form/input")).sendKeys("800002");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[7]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class, '_3dsJAO') and text()='Remove']"));
		explicitWait(driver,30,ele).click();
		
		WebElement ele1=driver.findElement(By.xpath("//div[contains(@class,'_3dsJAO _24d-qY FhkMJZ' )]"));
		explicitWait(driver,30,ele1).click();
		//driver.quit();

	}

}
