package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.Baseclass;

public class LoginPage extends Baseclass{

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;

	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[contains (text(),'Login')]")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void Login(String email,String password) {
	    sendkey(txtEmail, email);
		sendkey(txtpass, password);
		click(btnLogin);

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
