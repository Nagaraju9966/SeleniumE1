package WebelementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement loginBTN=driver.findElement(By.xpath("//Button[@type='submit']"));
	if(loginBTN.isEnabled()) {
		System.out.println("Enabled");
		loginBTN.click();
	}
	else
		System.out.println("Disabled");
	
	driver.findElement(By.name("username")).sendKeys("Nagaraju");
	driver.findElement(By.name("password")).sendKeys("Nagaraju9966");
	if(loginBTN.isEnabled()) {
		System.out.println("Enabled");
		loginBTN.click();
		
	}
	else
		System.out.println("Disabled");
	
	driver.quit();
	
	
}
}
