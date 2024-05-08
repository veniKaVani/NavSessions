package simpleseleniumsessionspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UniBrowserUtil4 {
	WebDriver driver;

	public WebDriver LaunchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser..." + browserName);
			throw new UniException4("BROWSER NOT FOUND");
		}
		return driver;

	}

	public void UniLaunchURL(String url) {
		if (url == null) {
			throw new UniException4("URL IS NULL");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new UniException4("HTTP IS MISSING IN URL");
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
