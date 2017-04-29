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
package com.test.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.model.Animal;
import com.test.model.Bird;

/**
 * @author gabkh01
 *
 */
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
