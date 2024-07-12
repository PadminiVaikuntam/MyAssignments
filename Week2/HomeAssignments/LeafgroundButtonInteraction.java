package Week2.HomeAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/button.xhtml");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//span[contains(text(), 'Click')]")).click();
		String Title = Driver.getTitle();
			boolean rt = Title.equals("Dashboard");
		if(rt=true)
			System.out.println("Dashboard page is selected");
				Driver.navigate().back();
		boolean chkStatus = Driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
		System.out.println(chkStatus);
		
		if(chkStatus==false)
			System.out.println("Confirm button is disabled");
		
		Point location = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println(location);
		
		String col = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		System.out.println(col);
		
		Dimension size = Driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println(size);
		
		Thread.sleep(2000);		
		Driver.close();
				
	}

}
