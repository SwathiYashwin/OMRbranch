package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.Pagemanager.PageObjectManager;
import com.omrbranch.baseclass.Baseclass;
import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.SearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1LoginStep extends Baseclass {
	PageObjectManager pom = new PageObjectManager();
	

	@Given("user is on the Greentech page")
	public void user_is_on_the_greentech_page() throws FileNotFoundException, IOException {
	    launchChromeBrowser(getpropertyfilevalue("browser"));
	    getUrl(getpropertyfilevalue("url"));
	    maximunwindow();
	    implicitwait(30);
	    
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String email, String password) {
	      pom.getLoginPage().Login(email, password);
	}
	
	@Then("user should verify after login sucess massage {string}")
	public void user_should_verify_after_login_sucess_massage(String expLoginmag) {
	     String actlogin = pom.getSearchHotel().search1();
	   Assert.assertEquals("verify after login", expLoginmag, actlogin);
	}




}
