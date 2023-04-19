package ui;

import constants.LogConstants;
import constants.URLConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Locators.LoginLocators;
import uitl.UtilFactory;

public class LoginPage extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
    public WebDriver driver;

    private UtilFactory utilFactory;

    public LoginPage() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);
    }
    @FindBy(xpath = LoginLocators.USERNAME)
    private WebElement userName;
    @FindBy(xpath = LoginLocators.PASSWORD)
    private WebElement passWord;
    @FindBy(xpath = LoginLocators.LOGIN)
    private WebElement login;
    @FindBy(xpath = LoginLocators.HOMEPAGE)
    private WebElement homePage;


    public void openUrl() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info(URLConstants.setUrl());
        super.openUrl(URLConstants.setUrl());


    }
    public void enterData(String username, String password){
        utilFactory.highlight(userName);
        utilFactory.highlight(passWord);
        userName.click();
        userName.sendKeys(username);
        String a = getDriver().findElement(By.xpath(LoginLocators.USERNAME)).getText();
        System.out.println("UserPass"+a);
        passWord.click();
        passWord.sendKeys(password);
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void clickLogin(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(login);
        login.click();
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public void homePage(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        homePage.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }


}
