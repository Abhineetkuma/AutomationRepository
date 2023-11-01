package actionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();

		
		WebElement src1=driver.findElement(By.xpath("//div[text()='Mobile Charger']\r\n" + ""));
		WebElement src2=driver.findElement(By.xpath("//div[text()='Laptop Charger']\r\n" + ""));
		WebElement src3=driver.findElement(By.xpath("//div[text()='Mobile Cover']\r\n" + ""));
		WebElement src4=driver.findElement(By.xpath("//div[text()='Laptop Cover']\r\n" + ""));
		
		WebElement target1= driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement target2= driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, target1).perform();
		act.dragAndDrop(src2, target2).perform();
		act.dragAndDrop(src3, target1).perform();
		act.dragAndDrop(src4, target2).perform();
	}

}
