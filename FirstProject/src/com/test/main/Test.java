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

/**
 * @author gabkh01
 *
 */
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