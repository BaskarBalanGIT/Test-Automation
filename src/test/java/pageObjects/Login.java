package pageObjects;

import org.openqa.selenium.By;

import utilities.Base;

public class Login {

	By uname = By.name("username");
	By pwd = By.name("password");
	By loginbutton = By
			.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

	Base base;

	public Login(Base base) {
		this.base = base;
	}

	public void enterUserName() {
		base.getDriver().findElement(uname).sendKeys("Admin");
	}

	public void enterPassword() {
		base.getDriver().findElement(pwd).sendKeys("admin123");;

	}

	public void clickLoginButton() {
		base.getDriver().findElement(loginbutton).click();;

	}

}
