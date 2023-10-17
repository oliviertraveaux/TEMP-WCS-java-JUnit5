package fr.wildcodeschool.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import fr.wildcodeschool.My;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldReturn0() {
        var my = new My();
        int res = my.myMethod();
        System.out.println("test res=" + res);
        assertEquals(0, res);
    }


}
