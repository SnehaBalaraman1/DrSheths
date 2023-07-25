package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcpage {
	ChromeDriver driver;
	By log=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By create=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[1]/button");
	By fname=By.xpath("//*[@id=\"FirstName\"]");
	By lname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By pswd=By.xpath("//*[@id=\"CreatePassword\"]");
	By submit=By.xpath("//*[@id=\"create_customer\"]/div/div/div[2]/ul/li[3]/div/input");

	
	public CreateAcpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void login()
	{
		driver.findElement(log).click();
		driver.findElement(create).click();
	}
	public void setvalues(String fsname,String lsname,String email1,String pwd)
	{
		driver.findElement(fname).sendKeys(fsname);
		driver.findElement(lname).sendKeys(lsname);
		driver.findElement(email).sendKeys(email1);
		driver.findElement(pswd).sendKeys(pwd);
		
	}
	public void sub()
	{
		driver.findElement(submit).click();
	}
}
