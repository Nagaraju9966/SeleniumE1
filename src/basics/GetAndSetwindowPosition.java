package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetwindowPosition {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Point point=driver.manage().window().getPosition();
	System.out.println(point);
	
	Point Point = new Point(500,500);
	driver.manage().window().setPosition(point);
	Thread.sleep(3000);
	driver.quit(); 
}
}
