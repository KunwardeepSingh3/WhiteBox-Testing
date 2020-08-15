package edu.qc.seclass;

public class BuggyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/**
	 * Add to the class a method called ​buggyMethod1​ that contains a division by
	 * zero fault such that (1) it is possible to create a test suite that achieves
	 * 100% statement coverage and does ​not​ reveal the fault, and (2) it is
	 * possible to create a test suite that achieves less than 50% statement
	 * coverage and reveals the fault.
	 */
	public static int buggyMethod1(int a, int b) {
		if (b > 0) {
			int ans = a / b;
			// System.out.println("red");
			return ans;
		}
		return a / b;
	}

	/**
	 * Add to the class a method called ​buggyMethod2​ that contains a division by
	 * zero fault such that (1) it is possible to create a test suite that achieves
	 * 100% statement coverage and does ​not​ reveal the fault, and (2) every test
	 * suite that achieves more than 50% branch coverage reveals the fault.
	 */
	public static int buggyMethod2(int a, int b) {
		int ans;
		if (b > 0) {
			ans = a / b;
		} else if (a > b) {
			ans = a / b;
		} else {
			ans = a / b;
		}
		return ans;
	}

	/**
	 * Add to the class a method called ​buggyMethod3​ that contains a division by
	 * zero fault such that (1) it is possible to create a test suite that achieves
	 * 100% branch coverage and does ​not​ reveal the fault, and (2) it is possible
	 * to create a test suite that achieves 100% statement coverage, does not
	 * achieve 100% branch coverage, and reveals the fault.
	 */
	public static int buggyMethod3(int a, int b) {
		int ans;
		if (b > 0) {
			ans = a / b;
			return ans;
		}
		if (a == 1) {
		}
		return ans = a / b;
	}

	/**
	 * Add to the class a method called ​buggyMethod4​ that contains a division by
	 * zero fault such that (1) every test suite that achieves 100% statement
	 * coverage reveals the fault, and (2) it is possible to create a test suite
	 * that achieves 100% branch coverage and does ​not​ reveal the fault.
	 */
	public void buggyMethod4() {
		/*
		 * If the tests have complete branch coverage then it also has complete
		 * statement coverage but this not true other way around. If every test that
		 * achieves 100% statement coverage is able to find the fault, it means that
		 * every test that achieves 100% branch coverage is also able to find the fault.
		 */
	}

	/**
	 * Add to class ​BuggyClass​ a method ​buggyMethod5​ by completing the code
	 * skeleton provided below so that (1) it is possible to create a test suite
	 * that achieves 100% statement coverage, and (2) the division by zero fault at
	 * line 4 cannot be revealed by any test suite.
	 */
	public void buggyMethod5() {
		/*
		 * In 100% Statement coverage, every statement is covered by the test suits.
		 * Thus, Line 4 will be invoked. Division by zero will always be invoked if we
		 * have 100% statement coverage, and therefore there is no test suite that can
		 * satisfy both a and b.
		 */
	}

}