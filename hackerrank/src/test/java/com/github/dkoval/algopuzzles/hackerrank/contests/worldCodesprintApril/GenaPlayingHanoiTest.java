package com.github.dkoval.algopuzzles.hackerrank.contests.worldCodesprintApril;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link GenaPlayingHanoi} solution.
 */
@RunWith(Parameterized.class)
public class GenaPlayingHanoiTest {
    private final int[] h;
    private final int answer;

    public GenaPlayingHanoiTest(int[] h, int answer) {
        this.h = h;
        this.answer = answer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 3, 0}, 3},
                {new int[]{0, 2, 3, 1, 3, 2, 0}, 12},
        });
    }

    @Test
    public void solution() throws Exception {
        int myAnswer = GenaPlayingHanoi.solve(h);
        assertEquals(answer, myAnswer);
    }
}
