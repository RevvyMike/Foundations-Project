package com.firstproject.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {
 
    private WebDriver driver;

    @FindBy(className = "getthis")
    public WebElement getSelector;

    @FindBy(className = "buttonclass")
    public WebElement sumbitUpdateButton;






    public Tester(WebDriver driver){
        this.driver= driver;

        PageFactory.initElements(driver, this);
    }


    public void clickButton(){
        this.sumbitUpdateButton.click();
    }



}
