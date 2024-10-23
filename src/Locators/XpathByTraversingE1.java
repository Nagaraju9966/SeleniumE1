package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversingE1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("goggles");
	driver.findElement(By.className("_2iLD__")).click();
	Thread.sleep(2000);
	
	String product=driver.findElement(By.xpath("//a[text()='UV Protection Wayfarer Sunglasses (53)']")).getText();
	String price=driver.findElement(By.xpath("//a[text()='UV Protection Wayfarer Sunglasses (53)']/parent::div/child::a/child::div/child::div[@class='Nx9bqj']")).getText();
	System.out.println(product +"\t"+price);
	driver.quit();
}
}
