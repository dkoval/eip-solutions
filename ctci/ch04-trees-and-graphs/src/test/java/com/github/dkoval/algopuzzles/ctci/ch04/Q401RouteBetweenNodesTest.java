package com.github.dkoval.algopuzzles.ctci.ch04;

import com.github.dkoval.algopuzzles.ctci.lib.Graph;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link Q401RouteBetweenNodes} solution.
 */
@RunWith(Parameterized.class)
public class Q401RouteBetweenNodesTest {
    private final Graph g;
    private final int start;
    private final int end;
    private final boolean answer;

    public Q401RouteBetweenNodesTest(Graph g, int start, int end, boolean answer) {
        this.g = g;
        this.start = start;
        this.end = end;
        this.answer = answer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {createTestGraph(), 3, 5, true},
        });
    }

    private static Graph createTestGraph() {
        Graph g = new Graph(6);
        g.add(new Graph.Edge(0, 1));
        g.add(new Graph.Edge(0, 2));
        g.add(new Graph.Edge(0, 3));
        g.add(new Graph.Edge(3, 4));
        g.add(new Graph.Edge(4, 5));
        return g;
    }

    @Test
    public void solution() {
        boolean myAnswer = Q401RouteBetweenNodes.search(g, start, end);
        assertEquals(answer, myAnswer);
    }
}
