package com.ixigo.testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ixigo.pageObjects.SearchFlightPage;
import com.ixigo.testBase.BaseClass;


public class TC_001_SearchFlight extends BaseClass
{
	@Test
	public void Search_Flight() throws InterruptedException
	{
		// Validating the First Page
		String exp_title="ixigo - Flights, IRCTC Train Booking, Bus Booking, Air Tickets & Hotels";
		String Act_title=driver.getTitle();
		if(Act_title.equals(exp_title))
		{
			Assert.assertTrue(true);
			System.out.println("Title of page: "+Act_title);
		}
		else
		{
			Assert.assertTrue(false);
		}
		SearchFlightPage sfp=new SearchFlightPage(driver);
		Thread.sleep(3000);
	//	sfp.setForm(confgprobObj.getProperty("from"));
		sfp.setForm("Delhi");
		Thread.sleep(3000);
		//sfp.setTo(confgprobObj.getProperty("to"));
		sfp.setTo("Mumbai");
		sfp.setDeparture();
		sfp.setReturn();
		sfp.setTraveller();
		sfp.setSearchButton();
		Thread.sleep(5000); 
		
		// Validate the page after search 
		String Search_exp_title="New Delhi - Mumbai, Economy Flights, roundtrip, 21 Apr - 23 Apr";
		String Search_Act_title=driver.getTitle();
		
		if(Search_Act_title.equals(Search_Act_title))
		{
			System.out.println("Title of page after clicking on Search Button: "+Search_Act_title);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}
	
}
