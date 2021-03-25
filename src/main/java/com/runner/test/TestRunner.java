package com.runner.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\alami\\Desktop\\learning\\Cucumber\\src\\main\\java\\Features\\login.feature",
         glue = {"stepDefinations"},
        plugin = {"pretty","html:test-output","junit:junit_xml/cucumber.xml","json:json-output/cucumber.json"},
       //format= {"junit:junit_xml/cucumber.xml"},
       dryRun = false,
        monochrome = true,
        strict = true
		)

public class TestRunner {
		

}
