package sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("admin12");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Abhineet");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
