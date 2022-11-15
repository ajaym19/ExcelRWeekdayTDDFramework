package com.excelR.pages;

import org.openqa.selenium.By;

import com.excelR.base.OHRMBase;
import com.excelR.pages.leaves.AssignLeave;

public class DashboardPage extends OHRMBase {

	public boolean checkDashboardMenu() {
		return driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	}
	
	public AssignLeave assignLeaveLauncher() {
		driver.findElement(By.xpath("//button[@title = 'Assign Leave']")).click();
		return new AssignLeave();
	}
}
