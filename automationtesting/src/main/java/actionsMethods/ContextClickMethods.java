package actionsMethods;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();

		Actions act = new Actions(driver);

		WebElement rightclick2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
		WebElement rightclick1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		WebElement rightclick3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
		act.contextClick(rightclick1).perform();

		driver.findElement(By.xpath("//div[text()='Yes']")).click();

		act.contextClick(rightclick2).perform();

		driver.findElement(By.xpath("//div[text()='Yes']")).click();

		act.contextClick(rightclick3).perform();

		driver.findElement(By.xpath("//div[text()='4']")).click();

		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("//span[text()='You selected \"Yes\"']");
		arr.add("(//span[text()='You selected \"Yes\"'])[2]");
		arr.add("//span[text()='You selected \"4\"']");
		
		for(int i=0;i<3;i++)
		{
			
			if (driver.findElement(By.xpath(arr.get(i))).isDisplayed()) {
				System.out.println("is displayed");
			}
		}
		
		
		//driver.quit();
	}

}
