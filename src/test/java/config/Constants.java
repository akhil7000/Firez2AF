package config;

/**************************************************************************************************
 * All the necessary constants stored at one place
 * 
 * Created by Akhil on 19-APRIL-18.
 *************************************************************************************************/
public class Constants {
    public static final String URL = "http://google.com/";   //base sample URL
    //Object Repo path
    public static final String Path_OR = ".\\src\\test\\java\\testing\\objectRepository\\OR2.txt";
    //List of Data Engine Excel sheets
    public static final String Path_TestData = ".\\src\\testing.dataEngine\\TestSuite2.xlsx";
    public static final String Sheet_TestCases = "TestSuite";  
    public static final String Path_TestResults = ".\\src\\testing.reports\\TestResult_TestSuite2.xlsx";
    //Name of TestSuite
    public static final String TestSuiteName = "TestSuite1";    
    //List of Data Sheet Column Numbers
    public static final int Col_TestCaseID = 0;
    public static final int Col_TestStepID = 1 ;
    public static final int Col_PageObject = 3;
    public static final int Col_ActionKeyword = 4 ;
    public static final int Col_DataSet = 5;
    // New entry in Constant Variable
    public static final int Col_RunMode = 2;
    // Create two new Constants variables for the results column of Test Case sheet and Test Step sheet
    public static final int Col_Result = 3 ;
    public static final int Col_TestStepResult = 6 ;
    // Create two new Constants variables for the Pass results & Fail result
    public static final String KEYWORD_FAIL = "FAILED";
    public static final String KEYWORD_PASS = "PASSED";

}
