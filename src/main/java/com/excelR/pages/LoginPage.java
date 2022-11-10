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
	
	public boolean login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	}
	
	
	public boolean forgotPassword() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
		return driver.findElement(By.xpath("//h6[text()='Reset Password']")).isDisplayed();
	}
}
