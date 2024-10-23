package CrossBrowserParallel;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	@Test
	public void seleniunTest() {
		driver.get("https://www.google.com/");
	}
}
