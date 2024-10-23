package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitExample1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
//	driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35'][contains(@type,'text')]")).sendKeys("nagaraju");
//	driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("nagaraju123");
WebElement LoginBTN=driver.findElement(By.xpath("//button[@type='submit']"));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(LoginBTN)).click();
driver.quit();
	
}
}
