package sychronizationForExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackByMethodExplicit {

	public static WebElement explicitWaits(WebDriver driver, int sec, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("452102");
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		// WebElement ele=
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='Check']")));
		WebElement ele = driver.findElement(By.xpath("//button[@name='Check']"));
		explicitWaits(driver, 30, ele).click();
	}

}
