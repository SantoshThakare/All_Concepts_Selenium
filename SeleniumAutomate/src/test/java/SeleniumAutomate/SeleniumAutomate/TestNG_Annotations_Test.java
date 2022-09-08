package SeleniumAutomate.SeleniumAutomate;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Annotations_Test {
	@Test
	public void test() {
		
		Reporter.log("test",true);
	}
	@Test
	public void run() {
		
		Reporter.log("run",true);
	}
}
