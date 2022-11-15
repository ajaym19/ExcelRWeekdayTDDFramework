package com.excelR.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelR.base.OHRMBase;
import com.excelR.pages.DashboardPage;
import com.excelR.pages.LoginPage;
import com.excelR.pages.leaves.AssignLeave;

public class DashboardPageTest extends OHRMBase{
	
	LoginPage lp;
	DashboardPage dp;
	AssignLeave alp;

	@BeforeMethod
	public void browserConfig() {
		initialization();
		lp = new LoginPage();

	}

	@Test
	public void validateAssignLeaveLauncher() {
		dp = lp.login();
		alp = dp.assignLeaveLauncher();
		alp.assignLeave();
	}
	
	@Test
	public void validateLeaveListLauncher() {
		
	}
	
	@Test
	public void validateTimesheetLauncher() {
		
	}
	
	@Test
	public void validateApplyLeaveLauncher() {
		
	}
	
	@Test
	public void validateMyLeaveLauncher() {
		
	}
	
	@Test
	public void validateMyTimesheetLauncher() {
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
