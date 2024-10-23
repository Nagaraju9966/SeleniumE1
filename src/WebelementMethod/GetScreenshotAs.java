package WebelementMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAs {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement zomoto=driver.findElement(By.xpath("//div[@class='sc-iIHjhz lgGAoQ']"));
			
	File temp=zomoto.getScreenshotAs(OutputType.FILE);
	File target=new File("./Screenshots/zomoto.png");
	FileHandler.copy(temp, target);
	driver.quit();
	
	
	
}
}
