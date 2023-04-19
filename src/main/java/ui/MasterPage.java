package ui;

import constants.LogConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Locators.MasterLocators;
import uitl.UtilFactory;

public class MasterPage extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(MasterPage.class);
    public WebDriver driver;

    private UtilFactory utilFactory;

    public MasterPage() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);
    }

    @FindBy(xpath = MasterLocators.CABIN_MASTER)
    private WebElement cabinMaster;
    @FindBy(xpath = MasterLocators.CABIN_NAME)
    private WebElement cabinName;
    @FindBy(xpath = MasterLocators.TIME_SLOTS)
    private WebElement timeSlots;
    @FindBy(xpath = MasterLocators.FUTURE_BOOKING)
    private WebElement futureBooking;
    @FindBy(xpath = MasterLocators.COMMENTS)
    private WebElement comment;
    @FindBy(xpath = MasterLocators.CABIN_ALLOCATION)
    private WebElement cabinAllocation;
    @FindBy(xpath = MasterLocators.ASSIGN_KAM)
    private WebElement assignKAM;
    @FindBy(xpath = MasterLocators.ASSIGN_BOX)
    private WebElement assignBox;
    @FindBy(xpath = MasterLocators.SELECT_KAM)
    private WebElement selectKAM;
    @FindBy(xpath = MasterLocators.WORKING_DAY_TIME)
    private WebElement workingDayTime;
    @FindBy(xpath = MasterLocators.SAVE)
    private WebElement save;
    @FindBy(xpath = MasterLocators.CABIN_ALLOTMENT)
    private WebElement cabinAllotment;
    @FindBy(xpath = MasterLocators.CABIN_SEARCH)
    private WebElement cabinSearch;
    @FindBy(xpath = MasterLocators.CABIN_DELETE)
    private WebElement cabinDelete;
    @FindBy(xpath = MasterLocators.DELETE_CONFIRM)
    private WebElement DeleteCON;
    @FindBy(xpath = MasterLocators.SUCCESSFULLY_DELETE)
    private WebElement deleteSuccess;


    public void clickAddCabinMaster() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(cabinMaster);
        cabinMaster.click();
    }

    public void cabinData(String cabinname, String futurebooking, String comments) {
        utilFactory.highlight(cabinName);
        cabinName.click();
        cabinName.sendKeys(cabinname);
        utilFactory.highlight(timeSlots);
        timeSlots.click();
        utilFactory.highlight(futureBooking);
        futureBooking.click();
        futureBooking.sendKeys(futurebooking);
        utilFactory.highlight(comment);
        comment.click();
        comment.sendKeys(comments);
        utilFactory.highlight(cabinAllocation);
        cabinAllocation.click();
      //  $(By.xpath(MasterLocators.CABIN_ALLOCATION)).click();
        utilFactory.highlight(assignKAM);
        assignKAM.click();
//        utilFactory.highlight(assignBox);
//        assignBox.click();
        utilFactory.highlight(selectKAM);
        selectKAM.click();
//        utilFactory.highlight(workingDayTime);
//        workingDayTime.click();
        utilFactory.highlight(save);
        save.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void clickSave() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
   //     $(By.xpath(MasterLocators.CABIN_ALLOCATION)).click();
        utilFactory.highlight(save);
        cabinMaster.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    public void clickCabin() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(cabinAllotment);
        cabinAllotment.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    public void search_Cabin() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(cabinSearch);
        cabinSearch.click();
        cabinSearch.sendKeys("sunil");
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void delete_Cabin() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(cabinDelete);
        cabinDelete.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void delete_Confirm(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(DeleteCON);
        DeleteCON.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void del_Suceess(){
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(deleteSuccess);
        deleteSuccess.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

}
