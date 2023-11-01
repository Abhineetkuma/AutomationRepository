package JavaScriptMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='abhineet'");
		jse.executeScript("document.getElementById('email').value='abhineet123@gmail.com'");
		jse.executeScript("document.getElementById('password').value='abhineet123'");
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		WebElement loginButton=driver.findElement(By.xpath("//span[text()='Login']"));
		
		
		if(registerButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",registerButton);
			System.out.println("clicked");
			jse.executeScript("arguments[0].click()",loginButton);
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("not Clicked");
		}
		driver.close();
		
		

	}

}
