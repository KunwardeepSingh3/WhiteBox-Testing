package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC1b {

	@Test
	public void test() {
		assertEquals(0, BuggyClass.buggyMethod1(8, 0));
	}
}
