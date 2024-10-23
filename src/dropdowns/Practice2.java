package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement coursesDropdown = driver.findElement(By.id("cars"));
		Select select = new Select(coursesDropdown);
		select.selectByIndex(0);
		select.selectByValue("90");
		select.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		Thread.sleep(2000);
		
		if(select.isMultiple()) {
			System.out.println("First selected option:" +select.getFirstSelectedOption().getText()+"\n");
			List<WebElement>selectedoptions=select.getAllSelectedOptions();
			System.out.println("Selected options: ");
			for(WebElement option : selectedoptions) {
				System.out.println(option.getText());
			}
			select.deselectByIndex(0);
			select.deselectByValue("90");
			select.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
			
			//select.deselectAll();
			
		} else
			System.out.println("Single select dropdown");
		driver.quit();
		
}
}
