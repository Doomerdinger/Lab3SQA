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
	         { 8, getList(Arrays.asList(2,3,5,7)) },
	         { 9, getList(Arrays.asList(2,3,5,7)) },
	         { 12, getList(Arrays.asList(2,3,5,7,11)) },
	         { 31, getList(Arrays.asList(2,3,5,7,11,13,17,19,23,29)) },
	         { 105, getList(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,
	        		 61,67,71,73,79,83,89,97,101,103)) },
	         { 1019, getList(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,
	        		 61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,
	        		 157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,
	        		 251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,
	        		 353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,
	        		 457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,
	        		 571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,
	        		 673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,
	        		 797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,
	        		 911,919,929,937,941,947,953,967,971,977,983,991,997,1009,1013)) }
	      });
	   }

	   @Test
	   public void testPrimeNumberGenerator()
	   {
	      assertEquals(expectedResult, 
	      PrimeFactor.getPrimes(inputNumber));
	   }
}
