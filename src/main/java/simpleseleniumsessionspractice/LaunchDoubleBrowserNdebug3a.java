package simpleseleniumsessionspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDoubleBrowserNdebug3a {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
