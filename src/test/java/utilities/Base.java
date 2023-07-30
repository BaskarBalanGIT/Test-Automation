package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private WebDriver driver;

	public WebDriver getDriver()

	{

		return driver;

	}

	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);

	}

}
