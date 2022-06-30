package com.firstproject.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    

    private WebDriver driver;

    //  This tells the PageFactory to find the element with ID dementor and assign it to this field
    @FindBy(id = "dementor")
    public WebElement createDefectInput;

    @FindBy(id = "workers")
    public WebElement assignTesterInput;

    @FindBy(tagName = "button")
    public WebElement submitDefectButton;

    public Manager(WebDriver driver){
        
        this.driver = driver; // initializes the private driver field
        PageFactory.initElements(driver, this); 

    }
    // These methods should allow manager to create defect and assign tester
    public void enterDefect(String dementor){
        this.createDefectInput.sendKeys(dementor);
    
    }

    public void enterTester(String workers){
        this.assignTesterInput.sendKeys(workers);
    
    }

    public void clickButton(){
        this.submitDefectButton.click();
    
    }

}
