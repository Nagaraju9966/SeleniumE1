package WebelementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetsize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	WebElement selenimIDE=driver.findElement(By.cssSelector("svg#selenium_ide"));
			
			org.openqa.selenium.Point loc = selenimIDE.getLocation();
			System.out.println("Location:"+loc);
		    System.out.println("X coordinate:"+loc.getX());
			System.out.println("Y coordinate:"+loc.getY());
			
			org.openqa.selenium.Dimension size = selenimIDE.getSize();
			System.out.println("Dimension:"+size);
			System.out.println("Height:"+size.getHeight());
			System.out.println("Width:"+size.getWidth());
			
					driver.quit();
}
}
