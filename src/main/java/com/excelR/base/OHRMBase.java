package com.excelR.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMBase {
	
	public static WebDriver driver;

	public void initialization() {
		System.out.println(4);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(5);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void tearDown() {
		driver.quit();
	}
}
