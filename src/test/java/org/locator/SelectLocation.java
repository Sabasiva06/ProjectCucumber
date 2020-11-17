package org.locator;

import org.base.LibGobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLocation extends LibGobal{
	
	public SelectLocation() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="location")
	private WebElement location;
	
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement inDate;
	
	@FindBy(id="datepick_out")
	private WebElement outDate;
	
	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="child_room")
	private WebElement child_room;
	
	@FindBy(id="Submit")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}
	
	
	
	
	
	
	
}
