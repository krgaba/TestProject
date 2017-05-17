
package com.test.main;

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
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humza\\Desktop\\JAVA\\jar\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
        driver.get("http://localhost:8080/TestApp");
    }
    
    @Test
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
        userPage.setSalary("$" + 30000);
        
    }
    
    @AfterTest
    public void cleanUp(){
        driver.close();
    }
     

}
