package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class BookHotelPage extends Baseclass {
	
	public BookHotelPage() {
       PageFactory.initElements(driver, this);
	}
     @FindBy(name="booking_for")
	private WebElement btnbooking;
     @FindBy(id="title")
	private WebElement ddnsalutation;
     @FindBy(name="first_name")
	private WebElement txtfirstname;
     @FindBy(name="last_name")
	private WebElement txtlastname;
     @FindBy(name="phone")
	private WebElement txtphnum;
     @FindBy(name="email")
	private WebElement txtemail;
     @FindBy(id="gst")
	private WebElement btngst;
     @FindBy(id="gst_registration")
	private WebElement txtgst;
     @FindBy(name="company_name")
	private WebElement txtcompany;
     @FindBy(name="company_address")
	private WebElement txtaddress;
     @FindBy(id="step1next")
	private WebElement btnnext;
     @FindBy(name="other_request")
	private WebElement txtotherreq;
     @FindBy(name="step2next")
	private WebElement btnnext2;
     @FindBy(xpath="//h5[contains (text(),'Credit/Debit/ATM Card')]\")")
	private WebElement btnpayment;
     @FindBy(name="payment_type")
	private WebElement ddncard;
     @FindBy(id="card_type")
	private WebElement ddncardtype;
     @FindBy(name="card_no")
	private WebElement txtcardno;
     @FindBy(name="card_name")
	private WebElement txtcardname;
     @FindBy(name="card_month")
	private WebElement ddncardmonth;
     @FindBy(id="cvv")
	private WebElement txtcvv;
     @FindBy(id="submitBtn")
	private WebElement brnsubmit;
     @FindBy(name="booking-code")
	private WebElement txtbookingno;
     @FindBy(xpath="//strong[contains (text(),'Hyatt Regency Chennai')")
	private WebElement txthotelname;
	public WebElement getBtnbooking() {
		return btnbooking;
	}
	public WebElement getDdnsalutation() {
		return ddnsalutation;
	}
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtphnum() {
		return txtphnum;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getBtngst() {
		return btngst;
	}
	public WebElement getTxtgst() {
		return txtgst;
	}
	public WebElement getTxtcompany() {
		return txtcompany;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getBtnnext() {
		return btnnext;
	}
	public WebElement getTxtotherreq() {
		return txtotherreq;
	}
	public WebElement getBtnnext2() {
		return btnnext2;
	}
	public WebElement getBtnpayment() {
		return btnpayment;
	}
	public WebElement getDdncard() {
		return ddncard;
	}
	public WebElement getDdncardtype() {
		return ddncardtype;
	}
	public WebElement getTxtcardno() {
		return txtcardno;
	}
	public WebElement getTxtcardname() {
		return txtcardname;
	}
	public WebElement getDdncardmonth() {
		return ddncardmonth;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getBrnsubmit() {
		return brnsubmit;
	}
	public WebElement getTxtbookingno() {
		return txtbookingno;
	}
	public WebElement getTxthotelname() {
		return txthotelname;
	}
     
	
	
	
	
	
	
}
