package actionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-edr49ft1/login.jsp");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.partialLinkText("Settings")).click();
		driver.findElement(By.partialLinkText("Logo & Color Scheme")).click();
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		WebElement doublClick = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doublClick).perform();
	}

}
