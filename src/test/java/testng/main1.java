package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class main1 {

	@Test
	private void tc1() {
		System.out.println("tc1");

	}

	@Test
	@Ignore
	private void tc2() {
		System.out.println("tc2");

	}

	@Test
	private void tc3() {
		System.out.println("tc3");

	}

	@Test
	public void method1() {
		System.out.println("tc4");

	}

	@Test
	public void method2() {
		System.out.println("tc5");
	}

	public void admission() {
		System.out.println("students");
	}

	public void details() {
		System.out.println("details of Students");
	}

	public void fees() {
		System.out.println("fee of single student");
	}

}
