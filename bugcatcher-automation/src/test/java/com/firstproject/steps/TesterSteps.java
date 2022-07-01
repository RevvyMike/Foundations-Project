package com.firstproject.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.firstproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {

    // Similar Given & then Steps

    @Given("Tester is on Tester homepage.")
    public void tester_is_on_Tester_homepage() {
        
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/Revature Training/Week4/Automation-Project/Foundations-Project/bugcatcher-automation/src/test/resources/webpages/Tester.Html");
        
    }

    @Given("Tester is in defense against the dark arts table on their homepage")
    public void tester_is_in_defense_against_the_dark_arts_table_on_their_homepage() {
        TestRunner.driver.get("File://C:/Users/Mike/Desktop/Revature Training/Week4/Automation-Project/Foundations-Project/bugcatcher-automation/src/test/resources/webpages/Tester.Html");
}

    @Then("Tester should click submit update defects.")
    public void tester_should_click_submit_update_defects() {
        TestRunner.tester.clickButton();
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        TestRunner.driver.switchTo().alert().accept();
}


    // Tester Steps Below

    @When("Tester selects accept defect.")
    public void tester_selects_accept_defect() {
        TestRunner.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        Select assignDefect = new Select(TestRunner.driver.findElement(By.className("pending")));
    assignDefect.selectByVisibleText("Accepted");
    


    }


    @When("Tester selects declines defect.")
    public void tester_selects_declines_defect() {
        Select assignDefect = new Select(TestRunner.driver.findElement(By.className("pending")));
    assignDefect.selectByVisibleText("Declined");
    }
   
    @When("Tester rejects the defect.")
    public void tester_rejects_the_defect() {
        Select assignDefect = new Select(TestRunner.driver.findElement(By.className("pending")));
    assignDefect.selectByVisibleText("Rejected");
    }


    @When("Tester fixes the bug.")
    public void tester_fixes_the_bug() {
        Select assignDefect = new Select(TestRunner.driver.findElement(By.className("pending")));
    assignDefect.selectByVisibleText("Fixed");
    }


    @When("Tester shelves the bug.")
    public void tester_shelves_the_bug() {
        Select assignDefect = new Select(TestRunner.driver.findElement(By.className("pending")));
    assignDefect.selectByVisibleText("Shelved");
    }

}
