package StepDef;

import constants.FeatureNameConstants;
import constants.LogConstants;
import io.cucumber.java.en.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Locators.MasterLocators;
import ui.LoginPage;
import ui.MasterPage;
import uitl.UtilFactory;

import java.io.IOException;
import java.util.List;


public class MasterStepDef extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(LoginStepDef.class);
    @Managed
    public WebDriver driver;
    LoginPage loginPage;
    MasterPage masterPage;
    UtilFactory utilFactory;

//   @When ("User is on SRK BEST  home page")
//   public void srkHomePage(){
//       loginPage.openUrl();
//       loginPage.enterData(utilFactory.readJSON(FeatureNameConstants.LOGIN,loginCredential.get(0).get(0),"username",
//                       "Login.json"),
//               utilFactory.readJSON(FeatureNameConstants.LOGIN,loginCredential.get(0).get(0), "password",
//                       "Login.json"));
//
//   }

    @When("User add to the cabin master")
    public void user_add_to_the_cabin_master() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.clickAddCabinMaster();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @When("User add to the cabin form")
    public void user_add_to_the_cabin_form(List<List<String>> loginCredential) throws ParseException, IOException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
      masterPage.cabinData(utilFactory.readJSON(FeatureNameConstants.CABIN_DETAILS,loginCredential.get(0).get(0),"cabinname",
                        "cabinDetails.json"),
                utilFactory.readJSON(FeatureNameConstants.CABIN_DETAILS,loginCredential.get(0).get(0), "futurebooking",
                        "cabinDetails.json"),
        utilFactory.readJSON(FeatureNameConstants.CABIN_DETAILS,loginCredential.get(0).get(0), "comments",
                "cabinDetails.json"));


    // masterPage.clickSave();



        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @When("User click on the save button")
    public void user_click_on_the_save_button() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.clickSave();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @When("User click on cabin allotment page")
    public void cabin_Allotment() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.clickCabin();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @When("User search the cabin allotment")
    public void search_Cabin(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.search_Cabin();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @And("User click on delete button")
    public void deleteButton(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.delete_Cabin();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @Then("User showing the confirmation message")
            public void deleteConfirm()
    {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.delete_Confirm();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @Then( "User showing successfully delete")
    public void deleteSucess(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        masterPage.del_Suceess();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
