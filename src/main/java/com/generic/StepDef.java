package com.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	SeleniumPageFactory pf;
	SoftAssert sa;
	
@Given("open browser")
public void open_browser() {
 driver=new ChromeDriver();  
 driver.manage().window().maximize();
}

@Given("Go to para bank application")
public void go_to_para_bank_application() {
  driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"); 
}

@When("put valid user name") 
public void put_valid_user_name() {
	 pf=new SeleniumPageFactory(driver);
pf.getUserName().sendKeys("student");
	
}

@When("put valid password")
public void put_valid_password() {
 pf.getPassWord().sendKeys("qa1234");
 
}

@When("click login button")
public void click_login_button() {
 pf.getLoginBtn().click(); 
}

@Then("login should pass and logout button should visible")
public  void login_should_pass_and_logout_button_should_visible() {
	pf=new SeleniumPageFactory(driver);
	
 sa=new SoftAssert();
sa.assertTrue(pf.getLogoutbtn().isDisplayed());
sa.assertAll();

}
	
@When("put invalid user name")
public void put_invalid_user_name() {
	pf=new SeleniumPageFactory(driver); 
	pf.getUserName().sendKeys("sadit"); 
}

@When("put invalid password")
public void put_invalid_password() {
   pf.getPassWord().sendKeys("123");
}

@Then("login should fail and an error message contains An internal error has occurred and has been logged.")
public void login_should_fail_and_an_error_message_contains_An_internal_error_has_occurred_and_has_been_logged() {
	 sa=new SoftAssert();
	sa.assertTrue(pf. getErrorMsgWithinvalidCredential().isDisplayed());
	sa.assertAll();
}


}
