package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestBC2 {

	@Test
	public void test() {
		assertEquals(-3, BuggyClass.buggyMethod2(9, -3));
		assertEquals(0, BuggyClass.buggyMethod2(10, 0));
	}

}
