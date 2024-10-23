package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoappskillrary {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	
	WebElement emailTF=driver.findElement(By.name("email"));
	emailTF.sendKeys("admin");
	
	WebElement passwordTF=driver.findElement(By.id("password"));
	passwordTF.sendKeys("admin");
	
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	
	WebElement loginBTN=driver.findElement(By.name("login"));
	loginBTN.click();
	
	Thread.sleep(3000);
	driver.quit();
}
}
