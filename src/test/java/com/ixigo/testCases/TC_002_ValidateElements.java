package com.ixigo.testCases;

import org.testng.annotations.Test;

import com.ixigo.pageObjects.FlightsListPage;
import com.ixigo.pageObjects.SearchFlightPage;
import com.ixigo.testBase.BaseClass;

public class TC_002_ValidateElements extends BaseClass {

	@Test
	public void validateElements() throws InterruptedException

	{
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
		
		FlightsListPage flp=new FlightsListPage(driver);
		flp.GetStopsFilter("1 stop");
		flp.GetDeparTureFliter();
		flp.GetAirlineDetails();
		
	}
}
