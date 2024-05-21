package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReports(String jsonFile) {
		File file = new File("C:\\Users\\Hi\\eclipse-workspace\\CucumberNew\\target");
		
		Configuration confi = new Configuration(file, "Omr Branch");
		
		confi.addClassifications("Browser", "chrome");
		confi.addClassifications("Browser Version", "1234");
		confi.addClassifications("os", "window11");
		confi.addClassifications("sprit", "4win");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		 
		ReportBuilder builder = new ReportBuilder(jsonfiles, confi);
		
		builder.generateReports();
		
		
		
		

	}

	
	

}
