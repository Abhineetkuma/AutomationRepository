package JavaScriptMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OnOmyoBlogSpot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		WebElement disableTextBox = driver.findElement(By.xpath("//input[@id='tb2']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)",disableTextBox);
		
		jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
		Thread.sleep(2000);
		File src=disableTextBox.getScreenshotAs(OutputType.FILE);
		File des= new File("./screenShots/disableEle1.png");
		Files.copy(src, des);
		driver.close();

	}

}
