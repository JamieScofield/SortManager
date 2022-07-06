import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Logger logger = LogManager.getLogger("My Logger");

    public static void main(String[] args) {

        logger.info("this is an info message");

        Controller controller = new Controller();
        controller.con();

    }
}
