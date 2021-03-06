package com.github.dkoval.algopuzzles.hackerrank.misc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.github.dkoval.algopuzzles.hackerrank.misc.LinkedListProblem.Node;
import static org.junit.Assert.assertEquals;

/**
 * Tests {@link LinkedListProblem} solution.
 */
@RunWith(Parameterized.class)
public class LinkedListProblemTest {
    private final int[] input;
    private final int[] answer;

    public LinkedListProblemTest(int[] input, int[] answer) {
        this.input = input;
        this.answer = answer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1}, new int[]{1}},
                {new int[]{1, 1}, new int[]{1}},
                {new int[]{1, 2, 1}, new int[]{1, 2}},
                {new int[]{1, 2, 2, 3, 3, 4}, new int[]{1, 2, 3, 4}},
                {new int[]{1, 2, 1, 2, 3, 3, 4}, new int[]{1, 2, 3, 4}},
                {new int[]{1, 0, 2, 1, 2, 3, 3, 4, 1}, new int[]{1, 0, 2, 3, 4}},
                {new int[]{0, 1, 2, 1, 2, 3, 3, 4, 1}, new int[]{0, 1, 2, 3, 4}},
                {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1}},
        });
    }

    @Test
    public void solution() throws Exception {
        Node initial = Node.create(input);
        Node myAnswer = LinkedListProblem.removeDuplicates(initial);
        assertEquals(Node.create(answer), myAnswer);
    }
}
