package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC3 {

	@Test
	public void test() {
		assertEquals(5, BuggyClass.buggyMethod3(20, 4));
		assertEquals(0, BuggyClass.buggyMethod3(50, 0));
	}

}
