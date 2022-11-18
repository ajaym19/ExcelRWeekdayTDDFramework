package com.excelR.pages;

import org.openqa.selenium.By;

import com.excelR.base.OHRMBase;

public class LoginPage extends OHRMBase {

	public String getTitle() {
		System.out.println(3);
		return driver.getTitle();
	}

	public boolean getLogo() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
	}

	public DashboardPage login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		captureScreenshot("login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}

	public boolean forgotPassword() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
		captureScreenshot("forgotPasswordTest");
		return driver.findElement(By.xpath("//h6[text()='Reset Password']")).isDisplayed();
	}
}
