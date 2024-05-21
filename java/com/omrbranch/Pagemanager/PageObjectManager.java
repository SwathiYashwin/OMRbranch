package com.omrbranch.Pagemanager;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.SearchHotel;
import com.omrbranch.pages.SelectHotel;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private MyBookingPage myBookingPage;
	
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage = new LoginPage():loginPage;
	}
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)? searchHotel = new SearchHotel():searchHotel;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)? selectHotel = new SelectHotel():selectHotel;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)? bookingConfirmPage = new BookingConfirmPage():bookingConfirmPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null) ? myBookingPage = new MyBookingPage():myBookingPage;
	}

}
