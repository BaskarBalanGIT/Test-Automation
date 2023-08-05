package utilities;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;

public class Hooks {

	//WebDriver driver;
	Base base;

	public Hooks(Base base) {
		this.base = base;
	}

	@Before

	public void beforeclass() {
		base.setDriver();

	}

}
