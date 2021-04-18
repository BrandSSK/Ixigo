package com.ixigo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage {
	public WebDriver driver;
	
	public SearchFlightPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@placeholder=\"Enter city or airport\"])[1]")
	WebElement drpFrom;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter city or airport\"])[2]")
	WebElement drpTo;
	
	@FindBy(xpath="//input[@placeholder='Depart']")
	WebElement DateDeparture;
	
	@FindBy(xpath="//input[@placeholder='Return']")
	WebElement DateReturn;
	
	@FindBy(xpath="(//input[@class='c-input u-v-align-middle'])[5]")
	WebElement OptTraveller;
	
	@FindBy(xpath="(//div[@class='u-ripple'])[1]")
	WebElement btnSearch;
	
	
	public void setForm(String txtfrom) throws InterruptedException
	{
		drpFrom.click();
		
		drpFrom.sendKeys(txtfrom+"\n");
		//drpFrom.submit();
		
		
	}
	
	public void setTo(String txtto) throws InterruptedException
	{
		// drpTo.clear();
		drpTo.click();
	Thread.sleep(3000);
		drpTo.sendKeys(txtto+"\n");
		Thread.sleep(3000);
		// drpFrom.sendKeys(Keys.ENTER);
	}
	
	public void setDeparture()
	{
	DateDeparture.click();
	
		// WebElement fromDate=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/div[1]"));
//		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Depart']"));
//		driver.switchTo().frame(ele);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/div[1]")).click();
		//Actions act=new Actions(driver);
		//act.moveToElement(fromDate).click();
	driver.findElement(By.xpath("(//table[@class='rd-days']//tr[4]//td[4])[1]")).click();
	}
	
	public void setReturn()
	{
		DateReturn.click();
//		WebElement ReturnDate=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/table/tbody/tr[4]/td[6]/div[1]"));
//		Actions act=new Actions(driver);
//		act.moveToElement(ReturnDate).click();
		driver.findElement(By.xpath("(//table[@class='rd-days'])[3]//tr[4]//td[6]")).click();
	}
	
	public void setTraveller()
	{
		OptTraveller.click();
//		WebElement passengernumber=driver.findElement(By.xpath("//span[@class=\"counter-item u-text-center u-ib current\" and contains(text(),2)]"));
//		WebElement close=driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[6]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]"));
//		Actions act=new Actions(driver);
//		act.moveToElement(passengernumber).click();
//		act.moveToElement(close).click();
		
		driver.findElement(By.xpath("//div[@class='u-box passanger-class-list flex-container']//div[2]//div[1]//span[3]")).click();
	}
	
	public void setSearchButton()
	{
		btnSearch.click();
	}
}
