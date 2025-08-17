package week5.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
    }
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
    }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
    }
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
    }
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
    }
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
    }
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
    }
	@Test
	public void testcase2() {
		System.out.println("testcase2");
    }
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
    }
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
    }
	

}
