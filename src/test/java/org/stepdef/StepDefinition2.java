package org.stepdef;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.base.LibGobal;
import org.junit.Assert;
import org.locator.BookAHotel;
import org.locator.LoginPage;
import org.locator.SelectHotel;
import org.locator.SelectLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition2 extends LibGobal {
	static WebDriver driver;
	SelectLocation loc;
	SelectHotel sec;
	BookAHotel book;

	@Given("User is on adacitin webpage")
	public void user_is_on_adacitin_webpage() {
		WebDriver driver = new ChromeDriver();
	}

	@When("user used to enter username and password")
	public void user_used_to_enter_username_and_password() {
		LoginPage log = new LoginPage();
		insertText(log.getUserName(), "karthi007");
		insertText(log.getPassword(), "Karthi@1989");
		click(log.getLogin());

	}

	@Then("user enter select location,hotel type,no of rooms,adult rooms and child rooms")
	public void user_enter_select_location_hotel_type_no_of_rooms_adult_rooms_and_child_rooms() {
		loc = new SelectLocation();
		selectByVissibleText(loc.getLocation(), "Sydney");
		selectByVissibleText(loc.getHotels(), "Hotel Sunshine");
		selectByVissibleText(loc.getRoomType(), "Double");
		selectByVissibleText(loc.getRoom_nos(), "3 - Three");
		insertText(loc.getInDate(), "17/10/2020");
		insertText(loc.getOutDate(), "18/10/2020");
		selectByVissibleText(loc.getAdult_room(), "3 - Three");
		selectByVissibleText(loc.getChild_room(), "2 - Two");
		click(loc.getSubmit());

	}

	@Then("user should select hotel and continue to booking")
	public void user_should_select_hotel_and_continue_to_booking() {
		sec = new SelectHotel();
		click(sec.getRadiobutton_0());
		click(sec.getContin());
	}

	@Then("User should enter firstname, lastname, address,ccno,cctype,expydate,expymnth and ccv")
	public void user_should_enter_firstname_lastname_address_ccno_cctype_expydate_expymnth_and_ccv() {
		book = new BookAHotel();
		insertText(book.getFirst_name(), "Karthi");
		insertText(book.getLast_name(), "Raj");
		insertText(book.getAddress(), "Chennai, Tamil Nadu");
	}

	@Then("user should verify order no.")
	public void user_should_verify_order_no() {
		System.out.println("Loggin Off!!!!");

		System.out.println("Logout Sucessfully");
	}

}
