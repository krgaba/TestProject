
package com.test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    
    private static WebDriver driver = null;
    
    
    
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    public void openProductListPage(){
        driver.findElement(By.xpath(".//a[@ng-reflect-href='/products']")).click();
    }

}
