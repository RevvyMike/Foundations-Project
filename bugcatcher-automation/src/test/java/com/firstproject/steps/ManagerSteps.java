package com.firstproject.steps;

import com.firstproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
    
    @Given("The manager is on their homepage.")
    public void the_manager_is_on_their_homepage() {
        
            // This grabs Manager.HTML from local file.
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/Revature Training/Week4/Automation-Project/bugcatcher-automation/src/test/resources/webpages/Manager.html");
    
    }



    @When("The manager creates defects.")
    public void the_manager_creates_defects() {
        TestRunner.manager.enterDefect("TestDefect");

    }

    @When("The manager assigns a tester to defects.")
    public void the_manager_assigns_a_tester_to_defects() {
        TestRunner.manager.enterTester("Tester");
    }

    @Then("The manager should click submit defects button when finished.")
    public void the_manager_should_click_submit_defects_button_when_finished() {
        
        TestRunner.manager.clickButton();
        
    }


}
