

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testapp {

	@Test
	public void testFindAns(){  
        assertEquals(3,MiniCalculator.calculate(1,2,'+'),0);  
        assertEquals(1,MiniCalculator.calculate(3,2,'-'),0);  
    }  
}