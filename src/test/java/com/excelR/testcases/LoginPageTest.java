package com.excelR.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelR.base.OHRMBase;
import com.excelR.pages.LoginPage;

public class LoginPageTest extends OHRMBase {

	/*
	 * Problems 1. Hard Coding of URL 2. writing same duplicate code in each method
	 * 3. executing only on chrome browser not as per user choice 4. the core login
	 * is mixed with the test case
	 */

	LoginPage lp;

	@BeforeMethod
	public void browserConfig() {
		initialization();
		lp = new LoginPage();

	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@Test
	public void validateLogoTest() {
		Assert.assertTrue(lp.getLogo());
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

	@Test
	public void validateLoginTest() {
		boolean check = lp.login();
		Assert.assertTrue(check);
	}

	@Test
	public void forgotPasswordTest() {
		Assert.assertTrue(lp.forgotPassword());
	}

}
