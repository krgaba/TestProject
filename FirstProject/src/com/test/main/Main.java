
package com.test.main;

import org.testng.TestNG;

import com.test.basic.FirstBasicTest;
import com.test.model.Animal;
import com.test.model.BankAccount;
import com.test.model.Bird;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        int a = 10;
//        char c = 'c';
//        String test = "Hello";
//        double decimal = 3.1;
//        boolean isMore = false;
//        String hello = "Hello";
//        String world = "World";
////        arrayTest();
//        Test test1 = new Test();
//        Test test2 = new Test();
//        
//        Person faisal = new Person("Faisal", "Gaba", "lots");
//        faisal.setFirstName("Khuram");
//        Person humza = new Person("Humza", "Ganatara", "male");
//        Person salah = new Person();
//        System.out.println("calculator = " + Test.calculator(14, 7, "minus"));
//      System.out.println("boolean test " + simple("yes"));
//        System.out.println("a + b = " + add(a,210));
//        System.out.println("a - b = " + subtract(a,210));
//        System.out.println("decimal + decimal = " + addDecimal(decimal, decimal));
//        System.out.println("addString = " + addString(hello, world));
//        System.out.println("booleanTest = " + booleanTest(20));
        
//        System.out.println(multiplyByTwo(10));
           
//        BankAccount savingAccount = new BankAccount("123-23-2345", 400);
//        savingAccount.setAccountName("Humza Ganatara");
//        savingAccount.setAccountType("Savings");
//        
//        savingAccount.printAccountInfo();
        
//        Animal mockingBird = new Animal("blue", 2, true);
//        mockingBird.printInfo();
        
//        Animal mockingBird = new Bird("yellow", 2, "blue");
//        mockingBird.printInfo();
//        
//        Animal lion = new Animal("yellow", 2, false);
//        lion.printInfo();
        
        
        TestNG test = new TestNG();
        test.setTestClasses(new Class[] { FirstBasicTest.class });
        test.run();
        
        
        
        

    }
    public static int add(int w, int z){
        return w + z ;
    }
    public static double addDecimal(double w, double z){
        return w + z ;
    }

    public static int subtract(int w, int z){
        return w - z ;
    }
    
    public static String addString(String str1, String str2){
        String blah = " :) ";
        return str1 + blah + str2;
    }
    
    
    public static String booleanTest(int i){
        
        if(i > 10){
            return "more";
        }
        else if(i < 10){
            return "less";
        }
        else{
            
            return "equal"; 
        }
        
    }
    
    public static int multiplyByTwo(int num){
        return num * 2;
    }
   
    
  public static int simple(String word){
      
      if(word.equals("yes")){
         return 1; 
      }
      else{
          return 0;
      }
      
  }
  
//  public static int calculator(int num1, int num2, String sign){
//
//      if(sign.equals("add")){
//          return num1 + num2;
//      }
//      
//      if(sign.equals("minus")){
//          return num1 - num2;
//      }
//      
//      if(sign.equals("multiply")){
//          return num1 * num2;
//      }
//      
//      if(sign.equals("divide")){
//          return num1/num2;
//      }
//      else{
//          return 0;
//      }
//  }
  
  
  public static void arrayTest(){
      
      int [] intArray = new int[4];
      
      intArray[0] = 6;
      intArray[1] = 12;
      intArray[2] = 62;
      intArray[3] = 62;
      
      
      
      for(int i = 0; i < intArray.length; i++){
          
          if(intArray[i] == 6){
              System.out.println("Found 6 on index= " + i);
          }
//          System.out.println(intArray[i]);
      }
      
//      int counter = 0;
//      while(counter < intArray.length){
//          
//          System.out.println(intArray[counter]);
//          counter ++;
//          
//      }
//               
      
      
//      System.out.println(intArray[0]);
//      System.out.println(intArray[1]);
//      System.out.println(intArray[2]);
      
      
      
  }
   


}
