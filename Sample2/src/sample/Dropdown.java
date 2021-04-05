package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "E:\\java eclipse\\operadriver.exe");
		WebDriver driver = new OperaDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*WebElement single = driver.findElement(By.id("select-demo"));
		Select dd = new Select(single);
		dd.selectByIndex(3);
		
		WebElement first = dd.getFirstSelectedOption();
		String sele = first.getText();
		System.out.println(sele);*/
		
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select mm = new Select(multi);
		mm.selectByIndex(0);
		mm.selectByValue("Florida");
		mm.selectByVisibleText("New Jersey");
		
		List<WebElement> getallop = mm.getOptions();
		int si = getallop.size();
		for (int i = 0; i < si; i++) {
			WebElement text = getallop.get(i);
			String se = text.getText();
			System.out.println(se);
		}
		
		
	}

}
