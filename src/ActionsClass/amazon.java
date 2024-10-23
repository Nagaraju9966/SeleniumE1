package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("handbags");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		WebElement slider=driver.findElement(By.id("p_36/range-slider_slider-items"));
		Actions action=new Actions(driver);
		action.scrollToElement(slider).perform();
	
		WebElement lower_bound_slider=driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
		WebElement upper_bound_slider=driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
		for(; ;) {
			if(lower_bound_slider.getAttribute("aria-valuetext").contains("10,"));
			break;
		}
		
		for(; ;) {
			if(upper_bound_slider.getAttribute("aria-valuetext").contains("20,"));
			break;	
		}
		
		driver.findElement(By.xpath("//input[contain(@aria-label,'Go ')]")).click();
		Thread.sleep(3000);
		String first_item_price =driver.findElement(By.xpath("//span[@class='a-price-whole'])[1]")).getText();
		
		System.out.println(first_item_price);
		driver.quit();
}
}