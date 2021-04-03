package samplle;

import java.sql.Driver;
import samplle.Sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 extends Sample{
	
	public static void main(String[]args) {
		String actual="praveen";
		int len = actual.length();
		char arr[] = actual.toCharArray();
		for (int i = len-1; i >=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
	