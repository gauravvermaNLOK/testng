package testngconceptproj.testngconcept;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionConcept {
	
	
	
	@Test
	public void test1()
	{
		/*Soft Assertion with Pass test*/
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Start test1");
		
		softAssert.assertEquals(false, true);
		
		System.out.println("End test1");
		softAssert.assertAll();
	}
	
	
	@Test
	public void test2()
	{
		/*Soft Assertion with Fail test*/
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Start test2");
		
		softAssert.assertEquals(true, true);
		
		System.out.println("End test2");
		softAssert.assertAll();
	}
	
	
	@Test
	public void test3()
	{
		/*Hard Assertion with Fail test*/
		System.out.println("Start test3");
		
		Assert.assertEquals(false, true);
		
		System.out.println("End test3");
	}
	
	
	@Test
	public void test4()
	{
		/*Hard Assertion with Pass test*/
		System.out.println("Start test4");
		
		Assert.assertEquals(true, true);
		
		System.out.println("End test4");
	}
	
	
	
	
}
