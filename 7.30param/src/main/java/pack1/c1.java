package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	
	@Parameters({"U","V"})// U=u   V=v
	@Test
	public void t1(String u, String v) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id=user
		ob.findElementById("user").sendKeys(u);
		
		//name=pass
		ob.findElementByName("pass").sendKeys(v);
		
		ob.findElementByClassName("btn_log").click();
		Thread.sleep(3000);
		ob.quit();
		
	}

}
