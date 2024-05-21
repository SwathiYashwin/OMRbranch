package com.omrbranch.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class SearchHotel extends Baseclass{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
       @FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
       private WebElement txtusername;
       @FindBy(id="state")
	   private WebElement ddnstate;
       
      @FindBy(id="select2-city-container")
	   private WebElement btncity;
	   @FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']")
       private WebElement btnchennai;
	   
	   @FindBy(id="room_type")
	   private WebElement ddnrooms;
	  @FindBy(name="check_in")
	   private WebElement txtcheckin;
//	   @FindBy(name="check_out")
//	   private WebElement txtcheckout;
//	   @FindBy(id="no_rooms")
//	   private WebElement ddnnoofrooms;
//	   @FindBy(id="no_adults")
//	   private WebElement ddnadults;
//	   @FindBy(id="no_child")
//	   private WebElement txtchild;
//	   @FindBy(id="hotelsearch_iframe")
//	   private WebElement frameid;
//	   @FindBy(id="searchBtn")
//	   private WebElement btnsearch;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getDdnstate() {
		return ddnstate;
	}
	public WebElement getBtncity() {
		return btncity;
	}
	public WebElement getBtnchennai() {
		return btnchennai;
	}
	
	public WebElement getDdnrooms() {
		return ddnrooms;
	}
	public WebElement getTxtcheckin() {
		return txtcheckin;
	}
//	public WebElement getTxtcheckout() {
//		return txtcheckout;
//	}
//	public WebElement getDdnnoofrooms() {
//		return ddnnoofrooms;
//	}
//	public WebElement getDdnadults() {
//		return ddnadults;
//	}
//	public WebElement getTxtchild() {
//		return txtchild;
//	}
//	public WebElement getFrameid() {
//		return frameid;
//	}
//	public WebElement getBtnsearch() {
//		return btnsearch;
//	}
	   
      public   void search(String state, String stroomtype, String checkIn, String checkout, String noofromms, String noofadult, String noofchildrens) throws InterruptedException {
    	
		dropdownActionBytext(ddnstate, state);
		Thread.sleep(3000);
		click(btncity);
		click(btnchennai);
        dropdownActionBytext(ddnrooms, stroomtype);
        InsertValueInTextBoxByJS(txtcheckin, checkIn);
//	    InsertValueInTextBoxByJS(txtcheckout, checkout);
//	    dropdownActionBytext(ddnnoofrooms, noofromms);
//	    dropdownActionBytext(ddnadults, noofadult);
//	    sendkey(txtchild, noofchildrens);
//	    SwitchToFrameID(frameid);
//	click(btnsearch);	
	    
		
		
		

	}

	public String search1() {
		String text = getText(txtusername);
		System.out.println(text);
		return text;
	}
       
	   
	   
	   
}
