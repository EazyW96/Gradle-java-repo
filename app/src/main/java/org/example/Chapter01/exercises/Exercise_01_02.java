import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise_01_02 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise_01_02.class);

    public static void main(String[] args) {
        logger.info("Starting Exercise_01_02");
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
            logger.debug("Printed message number: {}", i + 1);
        }
        logger.info("Finished Exercise_01_02");
    }
}
