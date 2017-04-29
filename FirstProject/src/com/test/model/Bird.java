
package com.test.model;

public class Bird extends Animal{

    
    /**
     * @param color
     * @param legs
     * @param canTheyFly
     */
    public Bird(String color, int legs, boolean canTheyFly) {
        super(color, legs, canTheyFly);
    }
    
    public Bird(String color, int legs, String wingColor){
        super(color, legs, true);
        this.wingColor = wingColor;

    }

    private String wingColor;
    
    /**
     * @return the wingColor
     */
    public String getWingColor() {
        return wingColor;
    }

    /**
     * @param wingColor the wingColor to set
     */
    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }
    
    public String printInfo(){
        System.out.println("Bird, color:"+ super.getColor() + ", legs: " + super.getLegs() + ", wing color: " + this.wingColor);
        return "Bird, color:"+ super.getColor() + ", legs: " + super.getLegs() + ", wing color: " + this.wingColor;
    }
}
