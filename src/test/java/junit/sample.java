package junit;

import org.junit.Ignore;
import org.junit.Test;

public class sample {

	@Test
	public void tc3() {
		System.out.println("tc3");
	}

	@Test
	@Ignore
	public void tc1() {
		System.out.println("tc1");
	}

	@Test
	public void tc2() {
		System.out.println("tc2");
	}
}
