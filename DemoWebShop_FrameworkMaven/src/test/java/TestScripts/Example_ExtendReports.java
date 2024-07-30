package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Generic.WebDriverUtility;

public class Example_ExtendReports {
	WebDriverUtility utility=new WebDriverUtility();
	ExtentReports report;
	ExtentTest test;
	
	@Test
	public void testcase01() {
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./Report/BatchExecution10.html");
		report=new ExtentReports();
		report.attachReporter(sparkReporter);
		test = report.createTest("Test Case -01 Verify user is able to register");
		 
		test.log(Status.INFO, "Launching The browser");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		test.log(Status.INFO, "Navigate to Register Page");

		test.log(Status.INFO, "Performing registration");
		
		test.log(Status.PASS, "Test CAse -01 Verify user is able to register");
		test.addScreenCaptureFromPath(utility.captureScreenShot(driver, "TestCase01"));
		driver.close();
		
	}
	
	@Test(priority = 2)
	public void testcase02() {
		
		
//		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./Report/DemoExecution123.html");
//		ExtentReports report=new ExtentReports();
//		report.attachReporter(sparkReporter);
		test = report.createTest("Test Case 01 - Verify user is able to Login");
		 
		test.log(Status.INFO, "Launching the Browser");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		test.log(Status.INFO, "Navigate to Login Page");

		test.log(Status.INFO, "Performing for Login");
		
		test.log(Status.PASS, "Test CAse 02 - Verify user is able to Login || pass");
		test.addScreenCaptureFromPath(utility.captureScreenShot(driver, "TestCase01"));
		
		
		driver.close();
		report.flush();


	}

}
