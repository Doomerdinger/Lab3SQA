import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	@Test
	public void testReturn4() 
	{
		tArray.clear();
		tArray.addAll(Arrays.asList(2,2));
		assertEquals(tArray, p.findFactors(4));
	}
	
	@Test
	public void testReturn6() 
	{
		tArray.clear();
		tArray.addAll(Arrays.asList(2,3));
		assertEquals(tArray, p.findFactors(6));
	}
	
	@Test
	public void testReturn8() 
	{
		tArray.clear();
		tArray.addAll(Arrays.asList(2,2,2));
		assertEquals(tArray, p.findFactors(8));
	}
}
