package com.github.dkoval.algopuzzles.hackerrank.challenges.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

/**
 * Tests {@link QuickSortPart1} solution.
 */
@RunWith(Parameterized.class)
public class QuickSortPart1Test {
    private final int[] input;

    public QuickSortPart1Test(int[] input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 5, 3, 7, 2}},
        });
    }

    @Test
    public void solution() throws Exception {
        QuickSortPart1.partitionInPlace(input);
        assertArrayPartitions(input);
    }

    private void assertArrayPartitions(int[] ar) {
        int p = ar[0];
        int lesser = 0, equal = 0, greater = 0;
        for (int elem : ar) {
            if (elem < p) {
                lesser++;
            } else if (elem > p) {
                greater++;
            } else {
                equal++;
            }
        }
        assertTrue(lesser + equal + greater == ar.length);
        assertTrue(lesser <= equal  && equal <= greater);
    }
}
