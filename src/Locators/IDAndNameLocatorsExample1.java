package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocatorsExample1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	
	WebElement emailTF=driver.findElement(By.id("email"));
	emailTF.sendKeys("abcdef@gmail.com");
	
	WebElement passwordTF=driver.findElement(By.name("pass"));
	passwordTF.sendKeys("adsghfkk");
	
	WebElement loginBTN=driver.findElement(By.name("login"));
	loginBTN.click();
	
	Thread.sleep(3000);
	driver.quit();
}
}
