import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OurFirstTest {

    private Integer sum(Integer a, Integer b) { return a + b; }

    private final Logger LOGGER = LogManager.getLogger(OurFirstTest.class);

    @Test
    public void showSum() {
        LOGGER.info("Now we start our test");
        Integer c;
        Integer d;

        LOGGER.info("Now we are summing two digits and get c");
        c = sum(15, 5);

        LOGGER.info("And again nd get d");
        d = sum(17, 13);

        System.out.println("C is: " + c + " \nD is: " + d);

//        Assertions.assertEquals(20, c, "wrong!");
        Assertions.assertEquals(21, c, "wrong!");
    }
}
