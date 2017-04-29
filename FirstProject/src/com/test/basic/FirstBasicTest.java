
package com.test.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.model.Animal;
import com.test.model.Bird;


public class FirstBasicTest {
    
    @Test
    public void animalTest(){
        
        Animal mockingBird = new Animal("blue", 2, true);
        Assert.assertEquals(mockingBird.getColor(), "blue");
        mockingBird.setColor("pink");
        Assert.assertEquals(mockingBird.getColor(), "pink");
        Assert.assertEquals(mockingBird.isCanTheyFly(), true);
        Assert.assertEquals(mockingBird.printInfo(), "Animal, color:pink, legs: 2, canTheyFly: true");
        
    }
    
    @Test
    public void printInfoBirdTest(){
        
        Animal mockingBird = new Bird("blue", 2, "yellow");
        Assert.assertEquals(mockingBird.printInfo(), "Bird, color:blue, legs: 2, wing color: yellow");
        
    }

}
