package Week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver Driver = new ChromeDriver();
Driver.get("https://www.leafground.com/radio.xhtml");
Driver.manage().window().maximize();
Thread.sleep(2000);
boolean enable1 = Driver.findElement(By.xpath("//label[@for='j_idt87:console1:0\']")).isSelected();
System.out.println(enable1);
Driver.findElement(By.xpath("//label[@for='j_idt87:console1:0\']")).click();
Driver.findElement(By.xpath("//label[@for='j_idt87:console1:0\']")).click();
boolean enable = Driver.findElement(By.xpath("//label[@for='j_idt87:console1:0\']")).isSelected();
if(enable==true)
	System.out.println("Button is enabled");
else
	System.out.println("Button is disabled");
	boolean selected = Driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).isSelected();
	System.out.println(selected);
	if(selected!=true)
		Driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).click();
	
	}

}
