package com.firstproject.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.firstproject.poms.Login;
import com.firstproject.poms.Manager;
import com.firstproject.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/firstproject/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})

public class TestRunner {
    

    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait wait;
    public static Manager manager;
    public static Tester tester;
    

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        
        //  make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        manager = new Manager(driver);
        tester = new Tester(driver);


        //  the WebDriverWait is used to tell selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 15);
    }


    @AfterClass // This makes the method exectue after all the steps
    public static void teardown(){
        driver.quit();
    }    
}
