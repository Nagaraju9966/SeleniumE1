package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowChildBrowserPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("goggles");
		driver.findElement(By.className("")).click();
		
		driver.findElement(By.linkText(")).click();"
		String parentId = driver.getWindowHandles();
		Set<String>windowIDS =driver.getWindowHandles();
		for(String str:windowIDS) {
			driver.switchTo().window(str);
			if(driver.getTitle().contains("Oval Sunglasses"));
			break;
			
		}
		
		
		driver.findElement(By.xpath("//button[text()='Add to cart']").click();
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.navigate().refresh();
		
		WebElement cartItemNumber = driver.findElement(By.className("Zusa--"));
		System.out.println(cartItemNumber.getText());
		driver.quit();
  
	
		
}
