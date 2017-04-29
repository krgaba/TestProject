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
package com.test.model;

/**
 * @author gabkh01
 *
 */
public class Animal {

    
    private String color;
    
    private int legs;
    
    private boolean canTheyFly;
    
    public Animal(String color, int legs, boolean canTheyFly){
        this.color = color;
        this.legs = legs;
        this.canTheyFly = canTheyFly;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * @return the canTheyFly
     */
    public boolean isCanTheyFly() {
        return canTheyFly;
    }

    /**
     * @param canTheyFly the canTheyFly to set
     */
    public void setCanTheyFly(boolean canTheyFly) {
        this.canTheyFly = canTheyFly;
    }
    
    public String printInfo(){
        System.out.println("Animal, color:"+ this.color + ", legs: " + this.legs + ", canTheyFly: " + this.canTheyFly);
        
        return "Animal, color:"+ this.color + ", legs: " + this.legs + ", canTheyFly: " + this.canTheyFly;
    }
    
    
    
}
