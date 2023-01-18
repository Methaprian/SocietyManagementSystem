package practice_package;

import org.testng.annotations.Test;

public class Sample1Test {
	
	@Test(groups = "smoke")
	public void sample_1_Test() {
		System.out.println("Sample_1_Executed");
	}
}
