package sceanario;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seanario4 {

	public static WebDriver driver;

	public static void callDriver(String driver) {
		if (driver.equals("chrome")) {
			seanario4.driver = new ChromeDriver();
		} else if (driver.equals("firefox")) {
			seanario4.driver = new FirefoxDriver();
		} else if (driver.equals("internet Explorer")) {
			seanario4.driver = new InternetExplorerDriver();
		}

	}

	public static void search(String product) throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']")).click();
		driver.findElement(By.xpath("//option[text()='Watches']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter browser name");
		String browser = sc.nextLine();

		System.out.println("enter the product name");
		String product = sc.nextLine();

		callDriver(browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");
		search(product);

	}

}
