import java.util.ArrayList;


public class PrimeFactor 
{
	public PrimeFactor()
	{
		
	}
	public ArrayList<Integer> findFactors(int num)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(num % 2 == 0)
		{
			array.add(2);
			num/=2;
		}
		if(num > 1)
			array.add(num);
		return array;
	}
}
