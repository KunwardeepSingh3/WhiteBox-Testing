package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC1a {

	@Test
	public void test() {
		assertEquals(2, BuggyClass.buggyMethod1(4, 2));
		assertEquals(-4, BuggyClass.buggyMethod1(-8, 2));
	}

}
