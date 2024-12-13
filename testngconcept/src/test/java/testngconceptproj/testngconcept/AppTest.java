package testngconceptproj.testngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test(groups = {"Smoke", "Regression"})
	public void test1()
	{
		/*Soft Assert will continue execution in case of fail
		 * It will not report any failure 
		 * */
		System.out.println("Starting Test1");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(true, false, "Expected value is false, Actual Value is true");
		softAssert.assertAll();
		System.out.println("Ending Test1");

	}

	@Test
	public void test2()
	{
		/*Soft Assert will */
		System.out.println("Starting Test2");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(false, false, "Expected and actual value are same i.e. false");
		System.out.println("Ending Test2");
		softAssert.assertAll();
	}

	@Test(groups = {"Smoke"})
	public void test3()
	{
		System.out.println("Starting Test3");

		Assert.assertEquals(false, false, "Expected and actual value are same i.e. false");
		System.out.println("Ending Test3");	
	}
	
	@Test
	public void test4()
	{
		System.out.println("Starting Test4");
		Assert.assertEquals(false, true);
		System.out.println("Ending Test4");	
	}
}
