package basics;


import java.util.Set;

import org.openqa.selenium.Cookie;

public class GetAndDeleteCookies {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	System.out.println("****Before Deleting Cookies***");
	Set<Cookies> cookies=driver.manage().getcookies();
		for(Cookie Cookies:cookies) {
			System.out.println(cookies.getName()+"\t"+cookies.getExpiry());
	}
		driver.manage().deleteAllcookies();
		System.out.println("***After deleting cookies***");
		 cookies=driver.manage().getcookies();
			for(Cookie Cookies:cookies) {
				System.out.println(cookies.getName()+"\t"+cookies.getExpiry());
		}
			driver.quit();
}

private static void deleteAllcookies() {
	// TODO Auto-generated method stub
	
}
}


