package StepDef;

import constants.FeatureNameConstants;
import constants.LogConstants;
import io.cucumber.java.en.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.LoginPage;
import uitl.UtilFactory;

import java.io.IOException;
import java.util.List;

public class LoginStepDef extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);
    @Managed
    public WebDriver driver;
    LoginPage loginPage;
    UtilFactory utilFactory;


    public LoginStepDef(){
        driver=super.getDriver();
        new UtilFactory(driver);
    }

    @Given("User is on the SRK Best home page")
    public void user_is_on_the_srk_best_home_page() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        //  getDriver().findElement(By.xpath("//input[@id='username']")).clear();
        logger.info("User is on home page");
        loginPage.openUrl();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @When("User enters username and password")
    public void user_enters_username_and_password(List<List<String>> loginCredential) throws ParseException, IOException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());

        loginPage.enterData(utilFactory.readJSON(FeatureNameConstants.LOGIN,loginCredential.get(0).get(0),"username",
                        "Login.json"),
                utilFactory.readJSON(FeatureNameConstants.LOGIN,loginCredential.get(0).get(0), "password",
                        "Login.json"));
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());


    }
    @When("User click the login button")
    public void user_click_the_login_button() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        loginPage.clickLogin();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @Then("User should successfully login")
    public void user_should_successfully_login() throws InterruptedException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        loginPage.homePage();
        Thread.sleep(10000);
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

}
