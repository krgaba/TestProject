
package com.test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.pageObjects.UserPage;


/**
 * @author gabkh01
 *
 */
public class SecondSeleniumTest {

	private static WebDriver driver = null;

	@BeforeTest
	public void setup() throws IOException{
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "/src/resources/configuration.properties";

		FileInputStream fs= new FileInputStream(path);
		prop.load(fs);
		String chromeDriverLocation = prop.getProperty("chrome.driver");

		if(System.getProperty("os.name").indexOf("Mac") >= 0){
			chromeDriverLocation += "/chromedriver";
		}
		else{
			chromeDriverLocation += "/chromedriver.exe";
		}

		System.out.println(chromeDriverLocation);
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost:8080/TestApp");
	}

	@Test(priority=1)
	public void createUserTest(){

		UserPage userPage = new UserPage(driver);

		//validate Title page
		String pageTitle = userPage.getPageTitle();
		Assert.assertEquals(pageTitle, "Test App");

		//Setting name
		Assert.assertEquals(userPage.getName(), "");
		userPage.setName("Andy Bee");
		Assert.assertEquals(userPage.getName(), "Andy Bee");

		// Setting Salary
		userPage.setSalary("30000");

		userPage.setAge(40);

		userPage.clickAddButton();

		Assert.assertEquals(userPage.getMessage(), "User created successfully");

	}


	@Test(priority=2)
	public void createDuplicateUser(){
		UserPage userPage = new UserPage(driver);

		//validate Title page
		String pageTitle = userPage.getPageTitle();
		Assert.assertEquals(pageTitle, "Test App");

		//Setting name
		Assert.assertEquals(userPage.getName(), "");
		userPage.setName("Andy Bee");
		Assert.assertEquals(userPage.getName(), "Andy Bee");

		// Setting Salary
		userPage.setSalary("30000");

		userPage.setAge(40);

		userPage.clickAddButton();

		Assert.assertEquals(userPage.getMessage(), "Error while creating User: Unable to create. A User with name Andy Bee already exist.");

	}


	@Test(priority=3)
	public void editUser(){
		UserPage userPage = new UserPage(driver);

		userPage.clickEdit();

		//Setting name
		Assert.assertEquals(userPage.getName(), "Andy Bee");
		userPage.setName("Khuram Gaba");
		Assert.assertEquals(userPage.getName(), "Khuram Gaba");

		userPage.clickUpdateButton();

		Assert.assertEquals(userPage.getMessage(), "User updated successfully");

	}

	@Test(priority=4)
	public void removeUser(){
		UserPage userPage = new UserPage(driver);

		userPage.clickRemove();

		Assert.assertEquals(userPage.getMessage(), "User deleted successfully");

	}
	@AfterTest
	public void cleanUp(){
		driver.close();
	}


}
