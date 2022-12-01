package org.pojo;

import java.util.Date;

import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProgram extends BaseClass {

	@BeforeClass
	private void launchtheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Seleniuminmakes@gmail.com");

		Assert.assertEquals(title, "Facebook", "Check your page title");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Inmakes");

	}

	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	private void tc4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test
	private void tc3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	private void endDdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	private void closeTheBrowser() {
		driver.close();

	}

}
