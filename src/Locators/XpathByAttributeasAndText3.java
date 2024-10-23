package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeasAndText3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='-2FKHZ']")).sendKeys("biryani");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Restaurants']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Pista House']")).click();
	Thread.sleep(2000);
	WebElement ratings=driver.findElement(By.xpath("//div[Qclass='sc-eCzpMH omRnt']"));
			System.out.println(ratings.getText());
	
}
}