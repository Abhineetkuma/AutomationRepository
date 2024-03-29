package byApplyingFilterToTheProduct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProducts {
	
	public static WebElement explicitWait(WebDriver driver,int sec, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']"));
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@title='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'_3879cV') and text()='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Ram Type']")).click();
		driver.findElement(By.xpath("//div[text()='LPDDR4X']")).click();
		Thread.sleep(2000);
		
		List<WebElement> allLaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i<allLaptop.size(); i++)
		{
			String laptop= allLaptop.get(i).getText();
			//Thread.sleep(2000);
			for(int j=i; j<=i ; j++)
			{
				String price= allprice.get(j).getText();
				Thread.sleep(2000);
				System.out.println(laptop + " = " + price);
			}
		}
	}

}
