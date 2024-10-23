package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonid 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement SeaTF=driver.findElement(By.id("twotabsearchtextbox"));
		SeaTF.sendKeys("wallets");
		driver.findElement(By.id("nav-search-submit-button"));
		SeaTF.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
