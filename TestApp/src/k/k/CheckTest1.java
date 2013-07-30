package k.k;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckTest1 {

	@Test
	public void testCheckConcate() {
		HelloTest test=new HelloTest();
		String result=test.checkConcat("one","two");
		assertEquals("onetwo",result);
		
	}

}
