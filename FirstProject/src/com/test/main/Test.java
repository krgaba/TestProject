
package com.test.main;

public class Test {
    
    public  int calculator(int num1, int num2, String sign){

        if(sign.equals("add")){
            return num1 + num2;
        }
        
        if(sign.equals("minus")){
            return num1 - num2;
        }
        
        if(sign.equals("multiply")){
            return num1 * num2;
        }
        
        if(sign.equals("divide")){
            return num1/num2;
        }
        else{
            return 0;
        }
    }
    
    protected void test(){
        
    }

}
