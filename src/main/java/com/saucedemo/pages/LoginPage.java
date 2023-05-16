package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField ;
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginbutton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productsText;

    @CacheLookup
    @FindBy(className = "inventory_item_label")
    List<WebElement> productsList;

    /*@CacheLookup
   // @FindBy(xpath = "//div[@class='inventory_list']//div//div//div[@class='inventory_item_name']")
    WebElement countProductsOnList;
*/

    public void enterUserName(String userName) {
        log.info("Enter username " + userName + " to username field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button " + loginbutton.toString());
        clickOnElement(loginbutton);
    }

    public String getTextFromProductsTitle() {
        log.info("Get text from products title");
        return getTextFromElement(productsText);
    }
    public int countProductOnList() {
        log.info("Count Total no of products");
        for (WebElement productNumber : productsList ) {
            productNumber.getSize();
        }
        return productsList.size();

//        List<WebElement> productsList = driver.findElements(By.className("inventory_item_label"));
//        return productsList.size();
    }


}
