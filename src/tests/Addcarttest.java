package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Addcartpage;
import pages.CreateAcpage;

public class Addcarttest extends Baseclass {
	@Test
	public void test() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		Addcartpage obj=new Addcartpage(driver);
		CreateAcpage ob=new CreateAcpage(driver);
		ob.login();
		ob.setvalues("Mariya", "Raj","mariyba456@gmail.com","mariya497");
		ob.sub();
		Thread.sleep(7000);
		obj.srch("Sunscreen");
		obj.cart();
		Thread.sleep(5000);
	}

}
