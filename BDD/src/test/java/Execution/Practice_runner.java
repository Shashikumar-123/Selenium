package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(features="./src/test/resources/Features/file.feature",glue="stepDefination",
			plugin = {"html:target/cucumber1-report1.html"},monochrome=true)


			public class Practice_runner extends AbstractTestNGCucumberTests{
				

			}

