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

}
