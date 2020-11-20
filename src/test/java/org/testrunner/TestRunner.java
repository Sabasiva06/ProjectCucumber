package org.testrunner;

import org.base.JVM_Report;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.stepdef" }, monochrome = true, plugin = {
		"json:src\\\\test\\\\resources\\\\Report\\\\testreport.json" })
public class TestRunner {

	@AfterClass
	public static void report() {
		JVM_Report.generatingReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\testreport.json");
		System.out.println("hiii java");
	}
}
