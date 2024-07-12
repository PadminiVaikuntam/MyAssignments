package Week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("https://leafground.com/checkbox.xhtml");
Driver.manage().window().maximize();
Thread.sleep(2000);
Driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
Driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
Driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
Driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();
Driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
Driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
boolean Chk = Driver.findElement(By.name("j_idt87:j_idt102_input")).isEnabled();
//Chk.click();

if(Chk)
 System.out.println("Toggle Switch is Enabled");
else 
	System.out.println("Toggle Switch is Disabled");
/*WebElement ListSel = Driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']"));

Select ListSel1 = new Select(ListSel);
ListSel1.selectByVisibleText("Miami");*/
Thread.sleep(2000);		
Driver.close();
		

	}

}
