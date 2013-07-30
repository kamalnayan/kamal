package k.k;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloTestTest {
	HelloTest test=new HelloTest();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckConcat() {

String result=test.checkConcat("one","two");
assertEquals("onetwo",result);
	}

	@Test
	public void testCheckMulti() {
		int result=test.checkMulti(2, 5);
		assertTrue(result==10);
	}

}
