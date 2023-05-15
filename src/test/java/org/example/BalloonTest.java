package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalloonTest {
    private static Balloon balloon;

    @BeforeClass
    public static void beforeClass() {
        balloon = new Balloon();
    }

    @Test
    public void count_balloonPresent() {
        int actual = balloon.maxNumberOfBalloons("ooobbbbbllllllnaautnn");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void count_balloonNotPresent() {
        int actual = balloon.maxNumberOfBalloons("lleetcodeban");
        int expected = 0;
        assertEquals(expected, actual);
    }
}
