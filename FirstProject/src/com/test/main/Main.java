
package com.test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.testng.TestNG;

public class Main {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        
        Properties prop = new Properties();

        //Use System.getProperty to get the relative path of file in Workspace. Now file path is machine independent.
        String path = System.getProperty("user.dir") + "/src/resources/configuration.properties";
//        System.out.println("Actual Location of File -> " + path);


        //Create FileInputStream object of Config/data file
        FileInputStream fs= new FileInputStream(path);

        // Pass fs object to load method of Properties object

        prop.load(fs);

        // Use getProperty method of Properties object to get the values.

//        System.out.println(prop.getProperty("chrome.driver"));
        String chromeDriverLocation = prop.getProperty("chrome.driver");
        
        if(System.getProperty("os.name").indexOf("Mac") >= 0){
            chromeDriverLocation += "/chromedriver";
        }
        else{
            chromeDriverLocation += "/chromedriver.exe";
        }
        System.out.println(chromeDriverLocation);
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        
        String suiteXml = System.getProperty("user.dir") + "/src/resources/testng.xml";
        
        TestNG test = new TestNG();
        
        List<String> suitefiles=new ArrayList<String>();
        suitefiles.add(suiteXml);
        
        test.setTestSuites(suitefiles);
//        test.setTestClasses(new Class[] { SecondSeleniumTest.class });
        test.run();
        
         

    }
   


}
