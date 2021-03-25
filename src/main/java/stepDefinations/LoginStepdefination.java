package stepDefinations;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepdefination {

	WebDriver driver;
	
	
	@Given("^User is already on osa login page$")
	public void User_is_already_on_osa_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://osaconsultingtech.com/forum.html");
		driver.manage().window().maximize();
	}
	
	@When("^Title of login page is osa login$")
	public void title_of_login_page_is_osa_login() {
	    String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("OSA Consulting Tech - All the projects.", title);
	}


	
	//~~examples keyword~~//
//	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enter_and(String username, String password) {
//		driver.findElement(By.id("username")).sendKeys(username); 
//		   driver.findElement(By.id("password")).sendKeys(password);  
//	}

	//.....datatable method....//

//@Then("^User enter username and passord$")
//public void user_enter_username_and_passord(DataTable credentials) {
//    List<List<String>> data =credentials.raw();
//    driver.findElement(By.id("username")).sendKeys(data.get(0).get(0)); 
//      driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//    
//}
//	
	//~~~data table with maps for parameterization of test cases~~//
	
	@Then("^User enter username and passord$")
	public void user_enter_username_and_passord(DataTable credentials) {
	   for(Map<String, String>data:credentials.asMaps(String.class, String.class)) {
	    driver.findElement(By.id("username")).sendKeys(data.get("username")); 
	      driver.findElement(By.id("password")).sendKeys(data.get("password"));
	     
	      }
	    
	}
		
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button(){
	    driver.findElement(By.id("login_button")).click();
	}

	@Then("^User is on Student page$")
	public void user_is_on_Student_page() {
	   String title1 = driver.getTitle();
	   System.out.println(title1);
	   Assert.assertEquals("OSA Consulting Tech - All the projects.", title1);
		
	}
	
	@Then("^close browser$")
	public void close_browser() throws Exception  {
	   Thread.sleep(5000);
		driver.quit();
}
}
