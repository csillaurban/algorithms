package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BfsGraphTest {
    BfsGraph bfsGraph;
    List<Vertex> vertices;

    @BeforeEach
    void setUp() {
        bfsGraph = new BfsGraph();
        bfsGraph.generateGraph();
        vertices = bfsGraph.getVertices();
    }

    @Test
    void calculateDistanceBetweenTwoVertices() {

        assertEquals(3, bfsGraph.calculateDistanceBetweenTwoVertices(vertices.get(0), vertices.get(8)));
    }

    @Test
    void selectVerticesOfVerticesInADistance() {
        assertEquals(5, bfsGraph.selectVerticesOfVerticesInADistance(vertices.get(6), 2).size());
    }

    @Test
    void showShortestPathBetweenTwoVertices() {
        assertEquals(4, bfsGraph.showShortestPathBetweenTwoVertices(vertices.get(3), vertices.get(6)).size());
    }
}