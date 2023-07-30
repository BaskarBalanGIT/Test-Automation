package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Login;
import utilities.Base;

public class PIM {

	Base base;
	WebDriver driver;
	Login login;

	public PIM(Base base) {
		this.base = base;
	}

	@Given("user landed on the homepage")
	public void user_landed_on_the_homepage() throws InterruptedException {
		base.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login = new Login(base);
		Thread.sleep(5000);
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();

		;

	}

	@When("user clicked PIM menu")
	public void user_clicked_pim_menu() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("user should see the search options")
	public void user_should_see_the_search_options() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("user should see add user button")
	public void user_should_see_add_user_button() {
		// Write code here that turns the phrase above into concrete actions

	}

}
