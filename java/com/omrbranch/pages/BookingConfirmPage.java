package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class BookingConfirmPage extends Baseclass {

	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement txtwelcome;
	@FindBy(xpath="//a[@href='https://omrbranch.com/my-bookings']")
	private WebElement btnacount;
	@FindBy(xpath="//div[@class='col-md-5']")
	private WebElement txtbooking;
	@FindBy(xpath="(//div[@class='room-code']/span)[1]\")")
	private WebElement txthotel;
	@FindBy(xpath="//h2[@class='px-3 py-2']")
	private WebElement txtbookingno;
	@FindBy(xpath="//h5[contains (text(),'Hyatt Regency Chennai Suite')]")
	private WebElement txthotelname;
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement txthotelprice;
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnedit;
	@FindBy(id="check_in")
	private WebElement txtcheckin;
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnconform;
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement txtalertmsg;
	
	
	
	
	
	
	
	
	
}
