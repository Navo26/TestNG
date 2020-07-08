package baseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@Before Suite :"+" "+"Executed");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test :"+" "+"Executed");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@Before Class :"+" "+"Executed");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@Before Method :"+" "+"Executed");

	}
	
	@Test
	public void test() {
		System.out.println("@Test :"+" "+"Executed");

	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@After Method :"+" "+"Executed");

	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@After Class :"+" "+"Executed");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@After Test :"+" "+"Executed");

	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@After Suite :"+" "+"Executed");

	}

}
