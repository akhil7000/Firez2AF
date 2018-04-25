package executionEngine;

import config.Constants;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import static support.ExecuteTestcase.execute_TestCase;

/**
 * Class to control / Driver Script
 * Created by Akhil on 20-APRIL-18. 
 * Version 2 
 */
public class RunTestNG {
    public static Properties OR;
    @BeforeMethod
    public void setUp() throws Exception{
    }
    @Test
    public void main() throws Exception  {
        System.out.println("Run");
        DOMConfigurator.configure("log4j.xml");
        String Path_OR = Constants.Path_OR;
        File file = new File(Path_OR);
        FileInputStream fs = new FileInputStream(file);
        //System.out.println(file.getAbsolutePath());
        OR = new Properties(System.getProperties());
        OR.load(fs);
        execute_TestCase(Constants.Path_TestData,Constants.Path_TestResults,Constants.TestSuiteName);
    }
    @AfterMethod 	
    public void tearDown() {
    }
}
