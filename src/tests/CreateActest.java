package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CreateAcpage;

public class CreateActest extends Baseclass {
	
	@Test
	public void test() throws Exception
	{
		CreateAcpage ob=new CreateAcpage(driver);
		
		ob.login();
		ob.setvalues("Mariya", "rose","riyabm123@gmail.com","riyab@783");
		ob.sub();
		Thread.sleep(6000);
	}

}
