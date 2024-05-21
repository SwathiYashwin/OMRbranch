package com.omrbranch.stepdefinition;

import com.omrbranch.Pagemanager.PageObjectManager;
import com.omrbranch.baseclass.Baseclass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2ExploreHotels extends Baseclass {
	PageObjectManager pom = new PageObjectManager();
	


	@When("user should search hotels {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotels_and(String state, String stroomtype, String checkIn, String checkout, String noofromms, String noofadult, String noofchildrens) throws InterruptedException {
		pom.getSearchHotel().search(state,  stroomtype, checkIn, checkout, noofromms, noofadult, noofchildrens);
	}



	@Then("user should verify after search hotel success massage {string}")
	public void user_should_verify_after_search_hotel_success_massage(String string) {
	   
	}

	
}
