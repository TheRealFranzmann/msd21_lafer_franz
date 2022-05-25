package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * My logging class for the debug and error messages
 */
public class Logging {

    public static Logger logger = LogManager.getLogger();

    public void errorMessage(){
        logger.error("This is my test error message");
    }
    public void infoMessage(){
        logger.info("This is my test info message");
    }
    public void debugMessage(String msg){
        logger.debug(msg);
    }
}
