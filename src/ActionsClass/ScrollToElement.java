package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement noCostEMI=driver.findElement(By.xpath("//span[contains(text(),'No cost EMI ')]"));
		Actions action=new Actions(driver);
		action.scrollToElement(noCostEMI).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
}
}
