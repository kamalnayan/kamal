package k.k;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckTest2 {

	@Test
	public void test() {
		HelloTest test=new HelloTest();
		int mult=test.checkMulti(10, 45);
		assertEquals(450,mult);
	}

}
