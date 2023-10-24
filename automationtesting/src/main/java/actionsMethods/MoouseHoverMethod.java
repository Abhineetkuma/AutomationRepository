package actionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoouseHoverMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Opening chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//opening the website of bluestone
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		//creating object of Actions to use the methods of actions class
		Actions act = new Actions(driver);
	
		WebElement target=driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='WATCH BAND JEWELLERY']")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
		}

}
