package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class MyBookingPage extends Baseclass{

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement txtwelcome;
	@FindBy(xpath="//a[@href='https://omrbranch.com/my-bookings']")
	private WebElement btnaccount;
	@FindBy(xpath="//div[@class='col-md-5']")
	private WebElement txtbooking;
	@FindBy(xpath="(//div[@class='room-code']/span)[1]")
	private WebElement btnhotel;
	@FindBy(xpath="//h2[@class='px-3 py-2']")
	private WebElement txtbookingno;
	@FindBy(xpath="//h5[contains (text(),'Hyatt Regency Chennai Suite')]")
	private WebElement txthotel;
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement txtprice;
	@FindBy(xpath="//a[@class='cancle btn filter_btn']")
	private WebElement btnclick;
	
}
