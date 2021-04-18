package com.ixigo.pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsListPage {

	public WebDriver driver;
	public FlightsListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//div[@class='checkbox-list-item ']")
	List<WebElement> filters;
	
	@FindBy(xpath="//button[@class='c-btn u-link secondary enabled']")
	List<WebElement> departureList;
	
	//@FindBy(xpath="//div[@class='time']")
	@FindBy(xpath="//div[@class=\"summary-section\"]//div[3]/div[1]")
	List<WebElement> FlightDepartureTime;
	
	@FindBy(xpath="//div[@class='u-text-ellipsis']")
	List<WebElement> FlightName;
	
	//@FindBy(xpath="//div[@class=\"c-flight-listing-split-row  hide-detail\"]//div[5]//div[1]//span[2]")
	@FindBy(xpath="//div[@class=\"price-group\"]")
	List<WebElement> FlightPrice;
	
	// @FindBy(xpath="//div[@class=\"c-flight-listing-split-row  hide-detail\"]")
	@FindBy(xpath="//div[@class=\"summary-section\"]")
	List<WebElement> FlightList;
	
	public void GetStopsFilter(String stps)
	{	
		for(WebElement fltrs: filters)
		{
			String values=fltrs.getText();
			System.out.println("Filter Options for Stops and Airlines "+values);
			if(values.equals(stps))
			{
			fltrs.click();
			System.out.println(values);
			}
		}
	}
	public void GetDeparTureFliter()
	{
		for(WebElement st: departureList)
			{
				System.out.println("Filter Options for Departure "+st.getText());
			}
			
	}
	public int GetFlightList()
	{
		int number=FlightList.size();
		System.out.println(number);
		return number;
	}
	public void GetAirlineDetails()
	{
		for(int i=0;i<FlightPrice.size();i++)
		{
			String price=FlightPrice.get(i).getText();
			int n=Integer.parseInt(price);
			if(n<7000)
			{
			System.out.println(FlightName.get(i).getText()+" "+FlightDepartureTime.get(i).getText()+" "+FlightPrice.get(i).getText());
			}
		}
	}
	
	
}
