package com.urban.algorithms.practice.graphs.bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BfsTest {

    @Test
    void calculateDistanceBetweenTwoVertices() {
        Bfs bfs = new Bfs();
        bfs.generateGraph();
        List<Vertex> vertices = bfs.getVertices();
        assertEquals(3, bfs.calculateDistanceBetweenTwoVertices(vertices.get(0), vertices.get(8)));
    }

    @Test
    void selectVerticesOfVerticesInADistance() {
    }

    @Test
    void showShortestPathBetweenTwoVertices() {
    }
}