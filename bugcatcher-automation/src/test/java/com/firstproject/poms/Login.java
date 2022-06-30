package com.firstproject.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//  this class is going to be a Java version of my login webpage
public class Login {
    /*
        by defining what web elements we want to interact with here instead of in the steps themselves we avoid
        writing "boilerplate" (think redundant) code.
     */
    private WebDriver driver; // This driver will only be used internally (in the class) so it is private

    //  these web elements need to be referenced in our steps so they are public

    //  This tells the PF to find the element with the id username and assign it to this field
    @FindBy(id = "username")    
    public WebElement usernameInput;

    //  this tells the PF to find the element with the id password and assign it to this field
    @FindBy(id = "password")
    public WebElement passwordInput;

    //  this tells the PF to find the first element created via button tags and assign it to this field
    @FindBy(tagName = "button")
    public WebElement loginbutton; 

    public Login(WebDriver driver){
        this.driver = driver; // this initializes the private driver field
/*
        The PageFactory class is provided by Selenium and it abstracts away from us the code that handles 
        initializing our WebElement fields. We simply provide the initElements() method with the private driver
        we initialize above, and the PageFactory class handles the rest!
 */
        PageFactory.initElements(driver, this);

    }

    /*
        these methods are public so we can access them in the steps, and their return type is void because 
        the functions do not return any values: they just interact with the web page
     */

     // this method will allow both managers and testers to enter their username
    public void enterUsername(String username){
       
        // to enter a username into the input element we use the sendKeys method
        this.usernameInput.sendKeys(username);
    }

    // this method will allow both managers and testers to enter their password
    public void enterPassword(String password){
        
        // to enter a password into the input element we use the sendKeys again
        this.passwordInput.sendKeys(password);
    }

    //  this method will allow Selenium to click on our login button
    public void clickButton(){

        // to click on an element you just use the click() method
        this.loginbutton.click();
    }
}
