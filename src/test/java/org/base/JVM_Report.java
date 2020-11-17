package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM_Report {

	public static void generatingReport(String Json) {
		
		File f=new File("C:\\Users\\WELCOME\\eclipse-workspace\\Sample_Cucumber\\src\\test\\resources\\Report");
		Configuration configuration =new Configuration(f, "Adactin Demo Page");
		configuration.addClassifications("Sprint", "10");
		configuration.addClassifications("browser", "Chrome");
		configuration.addClassifications("os", "Win-10");
		configuration.addClassifications("Env", "QA");
		
		List<String> rp=new ArrayList<String>();
		rp.add(Json);
		
		ReportBuilder report=new ReportBuilder(rp, configuration);
		report.generateReports();
		
		
		
	}
	
}
