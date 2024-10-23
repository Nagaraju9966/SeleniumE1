package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv 65+ inch");
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			driver.findElement(By.linkText("Sony 164 cm BRAVIA 2 K-65S25B LED 4K Ultra HD Smart TV | Google TV | Black)").click();
			

	}

}
