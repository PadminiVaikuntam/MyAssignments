package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeExample {

	public static void main(String[] args)throws InterruptedException
	{
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
EdgeDriver driver1 = new EdgeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.close();

driver1.get("https://www.facebook.com");
driver1.manage().window().maximize();
Thread.sleep(2000);
driver1.close();
	}

}
