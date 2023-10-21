package dropDownsMethos;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Abhi/Desktop/wcsm9WebElement/CarsDropDown.html");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='cars']"));

		Select opt = new Select(dropdown);
		List<WebElement> eles = opt.getOptions();

		/*
		 * HashSet<String> removeduplicate = new HashSet<String>(); 
		 * //before removing the duplicate options 
		 * System.out.println("before removing"); 
		 * for(WebElement ele: eles) 
		 * { 
		 * 	removeduplicate.add(ele.getText());
		 * 	System.out.print(ele.getText()+" "); 
		 * } 
		 * System.out.println();
		 * System.out.println("after removing the duplicate"); 
		 * for(String s: removeduplicate) 
		 * {
		 *  System.out.print(s+" "); 
		 * }
		 * 
		 */

		String[] getMenu = new String[eles.size()];

		for (int i = 0; i < eles.size(); i++) {
			getMenu[i] = eles.get(i).getText();
			System.out.println(getMenu[i]);
			
		}

		System.out.println();
		System.out.println("after remove of duplicate");
		for (int i = 0; i < getMenu.length; i++) {
			String s = getMenu[i];
			for (int j = i+1; j < getMenu.length; j++) {
				if (s.equals(getMenu[j])) {
					getMenu[j]="null";
				}
			}
			if(!getMenu[i].equals("null"))
			{
				System.out.println(getMenu[i]);
			}
		}

		driver.close();
	}

}
