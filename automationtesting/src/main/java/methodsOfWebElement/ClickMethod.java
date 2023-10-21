package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-edr49ft1/login.do");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}

}
