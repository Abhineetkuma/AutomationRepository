package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-edr49ft1/login.do");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		Thread.sleep(2000);
		username.clear();
		password.clear();

	}

}
