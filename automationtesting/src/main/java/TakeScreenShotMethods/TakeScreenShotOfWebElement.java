package TakeScreenShotMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Actions act = new Actions(driver);
		
		driver.findElement(By.id("denyBtn")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Coins']"))).perform();
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		WebElement ele = driver.findElement(By.id("pid_9163"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		
		File des= new File("./screenShots/jaiMataDi.png");
		
		Files.copy(src, des);
		
		
	}

}
