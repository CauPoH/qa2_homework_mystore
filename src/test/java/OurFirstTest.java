import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OurFirstTest {

    private Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Test
    public void showSum() {
        Integer c;
        Integer d;

        c = sum(15, 5);
        d = sum(17, 13);

       System.out.println("C is: " + c + " \nD is: " + d);

//        Assertions.assertEquals(20, c, "wrong!");
        Assertions.assertEquals(21, c, "wrong!");
    }
}
