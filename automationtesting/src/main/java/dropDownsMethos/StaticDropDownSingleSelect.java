package dropDownsMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownSingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement countryCode=driver.findElement(By.xpath("//select[contains(@class,'border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5')]"));
		Select selectCountryCode= new Select(countryCode);
		//selectCountryCode.selectByValue("+01");
		//selectCountryCode.selectByIndex(3);
		selectCountryCode.selectByVisibleText("+01");
	}

}
