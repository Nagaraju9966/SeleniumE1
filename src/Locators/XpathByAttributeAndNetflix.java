package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeAndNetflix {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='sign In']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("abcdegrt@gmail");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
