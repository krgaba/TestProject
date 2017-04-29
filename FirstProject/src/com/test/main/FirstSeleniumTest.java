/*******************************************************************************************************
****  Copyright (c) 2017 CA Technologies.  All rights reserved. 
 ****  This software and all information contained therein is confidential and proprietary and shall
 ****  not be duplicated, used, disclosed or disseminated in any way except as authorized by the
 ****  applicable license agreement, without the express written permission of CA. All authorized
 ****  reproductions must be marked with this language. 
 **** 
 ****  EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT PERMITTED BY APPLICABLE
 ****  LAW, CA PROVIDES THIS SOFTWARE WITHOUT WARRANTY OF ANY KIND, INCLUDING WITHOUT LIMITATION, ANY
 ****  IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  IN NO EVENT WILL CA
 ****  BE LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY LOSS OR DAMAGE, DIRECT OR INDIRECT, FROM
 ****  THE USE OF THIS SOFTWARE, INCLUDING WITHOUT LIMITATION, LOST PROFITS, BUSINESS INTERRUPTION,
 ****  GOODWILL, OR LOST DATA, EVEN IF CA IS EXPRESSLY ADVISED OF SUCH LOSS OR DAMAGE.
********************************************************************************************************/
/**
 * 
 */
package com.test.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.pageObjects.HomePage;

/**
 * @author gabkh01
 *
 */
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
