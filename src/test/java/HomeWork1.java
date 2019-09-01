import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class HomeWork1 {

    //Percentage of number
    private float percent(Integer a, Float b) {
        return ((b / 100) * a);
    }

    @Test
    public void showPercent() {
        float c; //percent
        float d; //number

        c = percent(13, 100f); //13% from 100
        d = percent(25, 8f); //25% from 100

        System.out.println("C is: " + c + " \nD is: " + d);

        Assertions.assertEquals(14, c, "no!");
    }

    //    Fuel consumption
    private float devide(Float e, Float f) {
        return (e / (f / 100));
    }

    @Test
    public void showDevide() {

        float j; //tank
        float h; //distance

        j = devide(80f, 1300f); //tank is 80l, and distance 1300 km
        h = devide(80f, 1000f); //tank is 80l, and distance 1000 km

//        System.out.println("J is: " + j + " l/100km \nH is: " + h);
        System.out.printf("J=%f l/100km; \nH=%f l/100km \n", j, h);

       Assertions.assertEquals(9, h, "no!");

    }

}
