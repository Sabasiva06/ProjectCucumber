package org.stepdef;

import java.net.MalformedURLException;

import org.base.LibGobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes_Class extends LibGobal {

	@Before()
	public void browerLaunh() throws MalformedURLException {
	driver=	launchBrowerStack();
		loadUrl("http://adactinhotelapp.com/index.php");

	}

	@After
	public void closeBrowser(Scenario sc) {

		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "img/png");

		driver.close();

	}

	// @Before
	// public void BrowerLaunch() {
	//// getDriver();
	//// loadUrl("http://adactinhotelapp.com/index.php");
	//
	// }
	//
	// @After
	// public void Close(Scenario sc) {
	//// TakesScreenshot tk = (TakesScreenshot) driver;
	//// byte[] b = tk.getScreenshotAs(OutputType.BYTES);
	//// sc.embed(b, "img/png");
	//// driver.close();
	// }
}
