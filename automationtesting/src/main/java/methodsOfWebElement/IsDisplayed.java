package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-edr49ft1/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebElement logout = driver.findElement(By.linkText("Logout"));
		Boolean status = logout.isDisplayed();
		System.out.println(status);
		logout.click();
		
		WebElement keepLogged = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(keepLogged.isSelected());
		keepLogged.click();
		System.out.println(keepLogged.isSelected());
	}

}
