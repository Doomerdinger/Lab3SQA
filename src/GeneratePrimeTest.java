import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GeneratePrimeTest 
{
	   private Integer inputNumber;
	   private ArrayList<Integer> expectedResult;

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public GeneratePrimeTest(Integer inputNumber, 
	      ArrayList<Integer> expectedResult)
	   {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	   
	   public static ArrayList<Integer> getList(List<Integer> list)
	   {
		   ArrayList<Integer> array = new ArrayList<Integer>();
		   array.addAll(list);
		   return array;
	   }

	   @Parameterized.Parameters
	   public static Collection primeNumbers() 
	   {
	      return Arrays.asList(new Object[][] {
	         { 2, getList(Arrays.asList()) },
	         { 3, getList(Arrays.asList(2)) },
	         { 4, getList(Arrays.asList(2,3)) },
	         { 5, getList(Arrays.asList(2,3)) },
	         { 6, getList(Arrays.asList(2,3,5)) },
	         { 7, getList(Arrays.asList(2,3,5)) },
	         { 8, getList(Arrays.asList(2,3,5, 7)) }
	      });
	   }

	   @Test
	   public void testPrimeNumberGenerator()
	   {
	      assertEquals(expectedResult, 
	      PrimeFactor.getPrimes(inputNumber));
	   }
}
