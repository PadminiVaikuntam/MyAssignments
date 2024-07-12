package Week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	 webElement m = driver.findElement(By.xpath(//input[@id='email']);
			 m.sendKeys("pvaikuntam@gmail.com");
		//driver.findElement(By.xpath(//div[@id='pass'])	sendKeys("Tuna@321");
		//driver.findElement(By.name("login")).click();
	//	driver.findElement(By.linkText("Find your account and log in.")).click();
	//	System.out.println(driver.getTitle());
driver.close()
	}

}
