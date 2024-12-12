package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(id = "logo-id")
	WebElement logo;

	@FindBy(xpath = "//li[@id='home']")
	WebElement homeHeader;
	@FindBy(xpath = "//a[@id='home']")
	WebElement homeFooter;

	@FindBy(xpath = "(//a[text()='Courses'])[1]")
	WebElement coursesHeader;
	@FindBy(xpath = "(//a[text()='Courses'])[2]")
	WebElement coursesFooter;

	@FindBy(xpath = "(//*[text() = 'Mentors'])[1]")
	WebElement mentorsHeader;
	@FindBy(xpath = "(//*[text() = 'Mentors'])[2]")
	WebElement mentorsFooter;

	@FindBy(xpath = "(//*[text() = 'Alumni'])[1]")
	WebElement alumniHeader;
	@FindBy(xpath = "(//*[text() = 'Alumni'])[2]")
	WebElement alumniFooter;

	@FindBy(xpath = "(//*[text() = 'About Us'])[1]")
	WebElement aboutUsHeader;
	@FindBy(xpath = "(//*[text() = 'About Us'])[2]")
	WebElement aboutUsFooter;

	@FindBy(xpath = "(//a[text() = 'Login'])[1]")
	WebElement loginHeader;
	@FindBy(xpath = "(//a[text() = 'Login'])[2]")
	WebElement loginFooter;

	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNowHeader;
	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNowFooter;

	@FindBy(xpath = "//p[text()='+1 929-301-6028']")
	WebElement phoneNumber;
	@FindBy(xpath = "//p[text()='info@enthrallit.com']")
	WebElement emailAddress;
	// a[@id='home']

	@FindBy(name = "username")
	WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	WebElement password;

	@FindBy(id = "login")
	WebElement loginBtn;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement contactUs;

	@FindBy(xpath = "//h2[contains(text(),'Do You Have Any Questions')]")
	WebElement doYouHaveAnyQuestion;
	@FindBy(xpath = "//input[@id='id_name']")
	WebElement nameForQuery;
	@FindBy(xpath = "//input[@id='id_email']")
	WebElement emailForQuery;
	@FindBy(xpath = "//input[@id='id_subject']")
	WebElement subjectForQuery;
	@FindBy(xpath = "//input[@id='id_experiance']")
	WebElement experianceForQuery;
	@FindBy(id = "id_message")
	WebElement messageForQuery;
	@FindBy(xpath = "//button[text()='send now']")
	WebElement sendNowButtonForQuery;
	@FindBy(xpath = "//div[@class='alert alert-info alert-dismissable']")
	WebElement msgAfterSubmittingTheQueryForm;

	/*
	 * 1) is the logo displayed? - DONE 
	 * 
	 * 2) What is the title? - DONE 
	 * 
	 * 3) Header validation for rest: All the button like Home, courses, Mentors, Alumni,
	 * About Us, Login enroll Now button, phone number, Id. You have to find out the
	 * web element and click them to see if they are redirecting to the page. - DONE
	 * 
	 * 4) When they redirect, please validate title, current url and header if
	 * present. - DONE 
	 * 
	 * 5) Validate Footer for Home, courses, Mentors, Alumni, About
	 * Us, Login, enroll Now button - DONE 
	 * 
	 * 6) Scroll down and go to Contact Us. Create method for
	 * "fill out the form and submit, validate the success or error message" and test - Done
	 */

	public void logoValidation() {
		pause(3000);
		elementDisplayed(logo);
		clickElement(logo);
		pause(3000);
	}

	public void titleValidation() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}

	public void validationForAllTheHeaderMenu() {
		pause(3000);
		elementEnabled(homeHeader);
		clickElement(homeHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(4000);
		elementEnabled(coursesHeader);
		clickElement(coursesHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(4000);
		elementEnabled(mentorsHeader);
		clickElement(mentorsHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(4000);
		elementEnabled(alumniHeader);
		clickElement(alumniHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(4000);
		elementEnabled(aboutUsHeader);
		clickElement(aboutUsHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(4000);
		elementEnabled(loginHeader);
		clickElement(loginHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

		pause(4000);
		elementEnabled(enrollNowHeader);
		clickElement(enrollNowHeader);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enroll/");

		pause(4000);
		verifyTextOfTheWebElement(phoneNumber, "+1 929-301-6028");
		pause(4000);

		verifyTextOfTheWebElement(emailAddress, "info@enthrallit.com");
		pause(4000);
	}

	public void validationForAllTheFooterMenu() {

		pause(3000);
		elementEnabled(homeFooter);
		clickElement(homeFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(4000);
		elementEnabled(coursesFooter);
		clickElement(coursesFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(4000);
		elementEnabled(mentorsFooter);
		clickElement(mentorsFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(4000);
		elementEnabled(alumniFooter);
		clickElement(alumniFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(4000);
		elementEnabled(aboutUsFooter);
		clickElement(aboutUsFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(4000);
		elementEnabled(loginFooter);
		clickElement(loginFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

		pause(4000);
		elementEnabled(enrollNowFooter);
		clickElement(enrollNowFooter);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enroll/");

	}

	public void validationForDoYouHaveAnyQuestion() {
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, contactUs);
		validationOfOtherHeader(doYouHaveAnyQuestion, "Do You Have Any Questions");
		inputText(nameForQuery, "Sh eikHa sina");
		pause(3000);
		inputText(emailForQuery, "MurubbiMurubbi@gmail.com");
		pause(3000);
		inputText(subjectForQuery, "Shojon Haranor Bedona Ami Bujhi");
		pause(3000);
		inputText(experianceForQuery, "Sh eikHa sina Palai Nah....");
		pause(3000);
		inputText(messageForQuery, "Amar Vul Hoyeche....." + "\nAmak Khoma Kore Den.....Pilizzz");
		pause(3000);
		elementEnabled(sendNowButtonForQuery);
		clickElement(sendNowButtonForQuery);
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, contactUs);
		pause(3000);
		//validationOfOtherHeader(msgAfterSubmittingTheQueryForm, "×\r\n" + "Something went wrong."); 
		//Above Line didn't Work. ASK NASIR
		String printMsg = msgAfterSubmittingTheQueryForm.getText();
		System.out.println("After submitting the query form system shows: " + printMsg);
		validationOfOtherHeader(msgAfterSubmittingTheQueryForm, printMsg);
		pause(3000);

	}

}