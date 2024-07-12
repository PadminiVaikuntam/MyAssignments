package Week2.HomeAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/. . ");
			
		Driver.manage().window().maximize();
		
		WebElement usernameField = Driver.findElement(By.id("username"));
		//Enter the username into the field as demosalesmanager , use a method sendKeys()
		usernameField.sendKeys("Demosalesmanager");
		
		//Locate the password field
//		Driver.findElement(By.className("inputLogin")).sendKeys("crmsfa"); // Class with duplicate
		Driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.className("crmsfa")).click();			
				
	Driver.findElement(By.linkText("Leads")).click();
	Driver.findElement(By.linkText("Find Leads")).click();
		Driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		Driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9791187401");
			Driver.findElement(By.linkText("Find Leads")).click();
			Driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId"));
//			Driver.findElement(By.xpath("//a[contains text(),'10087'])"));
			//Driver.findElement(By.linkText("http://leaftaps.com/crmsfa/control/viewLead?partyId=10087"));
			//String Firstid = 
					Driver.findElement(By.xpath("//div[@id='ext-gen994']"));
					//.getText();
			//String Firstid = Driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId")).getText();
			//Driver.findElement(By.xpath("//input[@name='id']")).sendKeys("Firstid");
		//System.out.println("The first id is "+Firstid);
		//Driver.findElement(By.xpath("//input[contains(text(), 'phonenumber')]")).sendKeys("9791187401");
		//Driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("9791187401");
		Thread.sleep(2000);
		Driver.close();
		//Driver.findElement(By.name("phoneNumber")).sendKeys("9791187401");
	
	
		
		
		
		
	//	Driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
	//	Driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
	//	Driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
	//	Driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();
	//	Driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
	//	Driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	//	WebElement Chk = Driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102\']"));
		//Chk.click();
	//	boolean b = Chk.isEnabled();
	//	if (b)
		// System.out.println("Toggle Switch is Enabled");
	//	else 
	//	System.out.println("Toggle Switch is Disabled");
	//	WebElement ListSel = Driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']"));

	//	Select ListSel1 = new Select(ListSel);
	//	ListSel1.selectByVisibleText("Miami");
		Thread.sleep(2000);		
		Driver.close();
				
	}

}
