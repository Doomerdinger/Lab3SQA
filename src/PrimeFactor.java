import java.util.ArrayList;
import java.util.Arrays;


public class PrimeFactor 
{
	public PrimeFactor()
	{
		
	}
	
	public ArrayList<Integer> findFactors(int num)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 2; num > 1; i++)
			for(; num % i == 0; num /= i)
				array.add(i);
		return array;
	}
	
	public static ArrayList<Integer> getPrimes(int num)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(num > 2)
		{
			array.add(2);
			if(num > 3)
				array.add(3);
		}
		for(int i = 5; i < num; i+=2)
		{
			boolean isPrime = true;
			for(int x : array)
				if(i % x == 0)
				{
					isPrime = false;
					break;
				}
			if(isPrime)
				array.add(i);
		}
		return array;
	}
}
