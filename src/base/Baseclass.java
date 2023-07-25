package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.drsheths.com/");
		driver.manage().window().maximize();
		}

}
