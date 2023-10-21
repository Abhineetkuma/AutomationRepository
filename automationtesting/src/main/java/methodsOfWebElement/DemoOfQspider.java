package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.dom.model.Rect;

public class DemoOfQspider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		Thread.sleep(30000);
		WebElement email= driver.findElement(By.cssSelector("input#email"));
		
		Point loc= email.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println(xaxis +" "+yaxis);
		
		Dimension size = email.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println(height+" "+width);
		
		Rectangle rect= email.getRect();
		System.out.println(rect.getHeight()+" "+rect.getWidth());
	}

}
