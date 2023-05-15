package org.example;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoodPearsTest {
    private static GoodPears pears;

    @BeforeClass
    public static void beforeClass() {
        pears = new GoodPears();
    }

    @Test
    public void count_fourGoodPears() {
        int actual = pears.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void count_allPearsGood() {
        int actual = pears.numIdenticalPairs(new int[]{1, 1, 1, 1});
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void count_noGoodPears() {
        int actual = pears.numIdenticalPairs(new int[]{1, 2, 3});
        int expected = 0;
        assertEquals(expected, actual);
    }
}
