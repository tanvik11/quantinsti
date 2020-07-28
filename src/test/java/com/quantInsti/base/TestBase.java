package com.quantInsti.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
		

	@BeforeSuite
	public void setUp() {

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://quantra.quantinsti.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action = new Actions(driver);
		wait = new WebDriverWait(driver,30);
		
	}	

		
       
	/*@AfterSuite
	public void tearDown() {

		if (driver != null) {

			driver.quit();
					}

	}*/
}
