package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void logoTest() {
		homePage.logoValidation();
	}

	@Test
	public void titleTest() {
		homePage.titleValidation();
	}

	@Test
	public void allTheHeaderMenuTest() {
		homePage.validationForAllTheHeaderMenu();

	}

	@Test
	public void allTheFooterMenuTest() {
		homePage.validationForAllTheFooterMenu();
	}

	@Test
	public void doYouHaveAnyQuestionTest() {
		homePage.validationForDoYouHaveAnyQuestion();
	}

}