package ustbatchno3.TestNG;


import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class CustomerTest 
    
{
	@Test
	public void Test1()
	{
		Customer e = new Customer("100", "AGK","Hyderabad", 3);
		List expected=Arrays.asList(5400,3600);
		List actual=Company.companydetails(e.getFeet(),e.getCity());
		assertEquals(expected,actual );
		
	}
//	@Test
//	public void Test2()
//	{
//		Customer e1 = new Customer("101", "ABK","Cochi", 2);
//		List expected1=Arrays.asList(5000,2400);
//		System.out.println(expected1);
//		List actual1=Company.companydetails(e1.getFeet(),e1.getCity());
//		System.out.println(actual1);
//		assertEquals(expected1,actual1);
//		
//	}
    
    
}