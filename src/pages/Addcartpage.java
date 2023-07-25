package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcartpage {
	
	ChromeDriver driver;
	By search=By.xpath("//*[@id=\"dr-sheth-39-s-best-skincare-product-range-online-in-india\"]/div[5]/div/header/div[1]/div[2]/div[3]/div/div[1]/input");
	By product=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	By addcart=By.xpath("//*[@id=\"product-main-form\"]/div[4]/div[1]/div[2]/div[1]/div/div/button");
	
	public Addcartpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void srch(String value)
	{
		driver.findElement(search).sendKeys(value);
	}
	public void cart()
	{
		driver.findElement(product).click();
		driver.findElement(addcart).click();
	}

}
