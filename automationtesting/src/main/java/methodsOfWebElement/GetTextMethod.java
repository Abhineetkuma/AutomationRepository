package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Thread.sleep(2000);
		List<WebElement> allPhones= driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement phone: allPhones)
		{
			System.out.println(phone.getText());
			//Thread.sleep(2000);
		}
		
		driver.close();
	}

}
