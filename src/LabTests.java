import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class LabTests 
{	
	PrimeFactor p = new PrimeFactor();
	ArrayList<Integer> tArray = new ArrayList<Integer>();
	
	@Test
	public void testReturn1() 
	{
		assertEquals(tArray, p.findFactors(1));
	}
	
	@Test
	public void testReturn2() 
	{
		tArray.clear();
		tArray.add(2);
		assertEquals(tArray, p.findFactors(2));
	}
	
	@Test
	public void testReturn3() 
	{
		tArray.clear();
		tArray.add(3);
		assertEquals(tArray, p.findFactors(3));
	}
}
