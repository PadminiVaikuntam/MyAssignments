package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser b1 = new Browser();
b1.launchBrowser("Edge");
b1.loadUrl();
	}

	
	public String launchBrowser(String browserName) {
		System.out.println(browserName +" Browser launched successfully");
		return browserName;
	}

public void  loadUrl()
{
	System.out.println("Application url loaded successfully");
}



}
