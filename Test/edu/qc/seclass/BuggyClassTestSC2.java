package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestSC2 {

	@Test
	public void test() {
		assertEquals(-4, BuggyClass.buggyMethod2(-8, 2));
		assertEquals(2, BuggyClass.buggyMethod2(4, 2));
		assertEquals(-2, BuggyClass.buggyMethod2(-4, 2));
		}
	}