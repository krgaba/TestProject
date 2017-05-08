package com.test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author gabkh01
 *
 */
public class UserPage {
    
    private WebDriver driver = null;
    
    public UserPage(WebDriver driver){
        this.driver = driver;
    }
    
    public String getPageTitle(){
        return this.driver.getTitle();
    }
    
    public void setName(String name){
        driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.name\"]")).sendKeys(name);
    }
    
    public String getName(){
       return driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.name\"]")).getAttribute("value");
    }
    
    public void setAge(int age){
        driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.age\"]")).sendKeys(Integer.toString(age));
    }
    
    
    public void setSalary(int salary){
        
    }
    
    public void clickAddButton(){
        
    }
    
    public String getNameUsersList(){
        return "Khuram";
    }
    
    
    

}
