package jUnitTestPacakage;

import static org.junit.Assert.*;

import org.junit.Test;


class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions t = new jUnitFunctions();
		int result=t.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}
