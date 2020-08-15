package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuggyClassTestBC3 {

	@Test
	public void test() {
		assertEquals(10, BuggyClass.buggyMethod3(10, 1));
		assertEquals(-5, BuggyClass.buggyMethod3(10, -2));
	}

}
