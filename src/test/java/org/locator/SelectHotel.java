package org.locator;

import org.base.LibGobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGobal {

	 public SelectHotel() {
		 PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="radiobutton_0")
		private WebElement radiobutton_0;
	
	@FindBy(id="radiobutton_1")
	private WebElement radiobutton_1;
	
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	@FindBy(id="radiobutton_2")
	private WebElement radiobutton_2;
	
	@FindBy(id="radiobutton_3")
	private WebElement radiobutton_3;
	
	@FindBy(id="radiobutton_4")
	private WebElement radiobutton_4;

	
	@FindBy(id="continue")
	private WebElement contin;
	
	
	
	public WebElement getContin() {
		return contin;
	}

	public WebElement getRadiobutton_1() {
		return radiobutton_1;
	}

	public WebElement getRadiobutton_2() {
		return radiobutton_2;
	}

	public WebElement getRadiobutton_3() {
		return radiobutton_3;
	}

	public WebElement getRadiobutton_4() {
		return radiobutton_4;
	}
	
	
	
}
