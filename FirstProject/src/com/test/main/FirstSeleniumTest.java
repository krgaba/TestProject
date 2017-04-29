
package com.test.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.pageObjects.HomePage;


public class FirstSeleniumTest {
    private static WebDriver driver = null;
    
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/gabkh01/dev/chromedriver");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
        driver.get("http://localhost:3000/welcome");
    }
    
    @Test
    public void openProductListPage(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        
        homePage.openProductListPage();
    }
    
    public void cleanUp(){
        driver.close();
    }

}
