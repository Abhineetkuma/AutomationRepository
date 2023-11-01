package JavaScriptMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollToElementAndTakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		
		Point c = ele.getLocation();
		
		int xaxis = c.getX();
		int yaxis = c.getY();
		
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		File src =ele.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenShots/twitter1.png");
		Files.copy(src, des);

	}

}
