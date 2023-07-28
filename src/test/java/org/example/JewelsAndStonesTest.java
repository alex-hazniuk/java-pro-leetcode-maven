package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {
    private static JewelsAndStones jewelsAndStones;

    @BeforeClass
    public static void beforeClass() {
        jewelsAndStones = new JewelsAndStones();
    }

    @Test
    public void count_jewelsPresentInStones() {
        int actual = jewelsAndStones.numJewelsInStones("aA", "aAAbbbbA");
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void count_jewelsNotPresentInStones() {
        int actual = jewelsAndStones.numJewelsInStones("u", "UU");
        int expected = 0;
        assertEquals(actual, expected);
    }
}
