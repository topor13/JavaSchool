import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger {
    private static final Logger logger = LoggerFactory.getLogger(
            MyLogger.class);
    public static void logout(String lvl, String msg) {
        if (lvl == "error") {
            logger.error(msg);
        } else  {
            logger.info(msg);
        }
    }
}
