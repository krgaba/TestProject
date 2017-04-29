
package com.test.model;

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
