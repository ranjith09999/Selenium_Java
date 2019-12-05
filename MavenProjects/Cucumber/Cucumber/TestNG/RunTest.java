package Cucumber.TestNG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(features="src/test/java/features/Login.feature",
				 glue="steps",
				 monochrome=true,
				 tags= {"~@Smoke"}
				 /*,dryRun=true,
				 snippets=SnippetType.CAMELCASE*/)
public class RunTest extends 
 				AbstractTestNGCucumberTests{






}
