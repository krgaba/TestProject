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
        driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.name\"]")).clear();
        driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.name\"]")).sendKeys(name);
    }
    
    public String getName(){
       return driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.name\"]")).getAttribute("value");
    }
    
    public void setAge(int age){
        driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.age\"]")).sendKeys(Integer.toString(age));
    }
    
    
    public void setSalary(String salary){
    	
    	driver.findElement(By.xpath(".//input[@ng-model=\"ctrl.user.salary\"]")).sendKeys(salary);
        
    }
    
    public void clickAddButton(){
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
    
    public void clickUpdateButton(){
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
    
    public String getNameUsersList(){
        return "Khuram";
    }
    
    public String getMessage(){
        return driver.findElement(By.xpath("//div[contains(@class, 'alert')]")).getText();
    }
    
    public void clickEdit(){
        driver.findElement(By.xpath(".//button[@ng-click=\"ctrl.editUser(u.id)\"]")).click();
    }
    
    
    

}
