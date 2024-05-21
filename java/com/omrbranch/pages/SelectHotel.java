package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class SelectHotel extends Baseclass{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h5[contains(text(),'Select Hotel')]")
	private WebElement txtselethotel;
	@FindBy(xpath="//h5[contains (text(),'Hyatt Regency Chennai Suite')]")
	private WebElement txthotelname;
	@FindBy(xpath="//strong[contains (text(),'$ 3,068')]")
	private WebElement txtprice;
	@FindBy(xpath="//a[@href='https://omrbranch.com/view-hotel/29?state=Tamil+Nadu&city=Chennai&room_type%5B%5D=Suite&check_in=2024-05-24&check_out=2024-05-26&no_rooms=1&no_adults=1&no_child=1']")
	private WebElement btnhotel;
	public WebElement getTxtselethotel() {
		return txtselethotel;
	}
	public WebElement getTxthotelname() {
		return txthotelname;
	}
	public WebElement getTxtprice() {
		return txtprice;
	}
	public WebElement getBtnhotel() {
		return btnhotel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
