package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class Login {
	/*
	 Create Constructor - DONE
	 Create Web Element - DONE
	 Create method to test - DONE
	 */	
	/*
	 1) Click Login from header - DONE
	 2) The page will direct to Login Page, validate title, current url, header etc. - DONE
	 3) provide your email and password and click submit button - DONE
	 4) When click a button make sure, the button is enabled, verify text and them click, verify logo, current url, title, header -DONE
	 */	
	
	WebDriver driver;
	WebDriverWait wait;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "(//a[text() = 'Login'])[1]")
	WebElement loginHeaderMenu;
	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginPageHeader;
	@FindBy(id = "logo-id")
	WebElement logo;
	@FindBy(name = "username")
	WebElement emailTextField;
	@FindBy(xpath = "//*[@id='password']")
	WebElement passwordTextField;
	@FindBy(id = "login")
	WebElement loginBtn;
	@FindBy(xpath = "//i[@id='togglePassword']")
	WebElement togglePassword;
	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement invalidCredentialWarning;
	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashboardPageHeader;
	
	
	public void loginPageBasicValidation() {
		pause(3000);
		elementDisplayed(logo);
		clickElement(logo);
		pause(3000);
		elementEnabled(loginHeaderMenu);
		clickElement(loginHeaderMenu);
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfHeader(loginPageHeader, "Login into your account");
		pause(3000);
	}
	
	public void invalidCredentialValidation() {
		pause(3000);
		elementEnabled(loginHeaderMenu);
		clickElement(loginHeaderMenu);
		inputText(emailTextField, "15 $%%^&* email vule gesi.com");
		inputText(passwordTextField, "  password aro beshi vule gesi");
		elementEnabled(togglePassword);
		clickElement(togglePassword);
		pause(5000);
		elementEnabled(loginBtn);
		clickElement(loginBtn);
		pause(4000);
		String errorMsg = invalidCredentialWarning.getText();
		System.out.println("The message fot the invalid credential is: " + errorMsg);

	}
	
	public void validCredentialValidation() {
		pause(3000);
		elementEnabled(loginHeaderMenu);
		clickElement(loginHeaderMenu);
		inputText(emailTextField, "mtks483@gmail.com");
		inputText(passwordTextField, "Tofael@483");
		elementEnabled(togglePassword);
		clickElement(togglePassword);
		pause(1000);
		clickElement(togglePassword);
		pause(2000);
		elementEnabled(loginBtn);
		clickElement(loginBtn);
		pause(4000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfHeader(dashboardPageHeader, "Dashboard");
		pause(3000);

	}

}
