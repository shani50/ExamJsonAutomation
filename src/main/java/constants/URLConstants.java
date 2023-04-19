package constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLConstants {
    private static Logger logger = LoggerFactory.getLogger(URLConstants.class);

    public static String setUrl() {

        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        String launchUrl = "";
        if (System.getProperty("env").equals("qa")) {
            launchUrl = "http://qapure.srk.best:7007/login";
        }else{
            logger.debug("Incorrect environment.");
        }
        logger.debug(LogConstants.LOG_ENTER+Thread.currentThread().getStackTrace()[1].getMethodName());
        return launchUrl;

    }
}
