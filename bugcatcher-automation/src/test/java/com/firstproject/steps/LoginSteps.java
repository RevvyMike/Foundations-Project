package com.firstproject.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.firstproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
/*
    User Agnostic Steps below
 */

    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/Revature Training/Week4/Automation-Project/Foundations-Project/bugcatcher-automation/src/test/resources/webpages/Login.html");
    
    }

    @When("The employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
       TestRunner.login.clickButton();
    }

/*
    Manager Steps Below
 */

    @When("The manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
      
        TestRunner.login.enterUsername("Manager");
    }

    @When("The manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        
        TestRunner.login.enterPassword("Automation");
    }

    @Then("The manager should be logged into the manager home page.")
    public void the_manager_should_be_logged_into_the_manager_home_page() {
        
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager Homepage"));
        //  this method checks that my simulated manager has actually ended up on the manager page
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Manager Homepage", title);
    }

    /*
        Tester Steps Below
     */

    @When("The tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        
        TestRunner.login.enterUsername("Tester");
    }

    @When("The tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
       
        TestRunner.login.enterPassword("Automation");
    }

    @Then("The tester should be logged into the tester home page")
    public void the_tester_should_be_logged_into_the_tester_home_page() {
        
        TestRunner.wait.until(ExpectedConditions.titleIs("Tester Homepage"));
        //  this method checks that my simulated manager has actually ended up on the tester page
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Homepage", title);
    }


}
