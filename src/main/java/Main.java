import View.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger("My Logger");

    public static void main(String[] args) {

        logger.info("Start of the application");

        Controller controller = new Controller();
        controller.con();

    }
}
