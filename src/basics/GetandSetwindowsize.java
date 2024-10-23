package basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandSetwindowsize {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Dimension dimenssion=driver.manage().window().getSize();
	System.out.println(dimenssion);
	
	Dimension dimension = new Dimension(1800,900);
	driver.manage().window().setSize(dimenssion);
	Thread.sleep(3000);
	driver.quit();
}
}
