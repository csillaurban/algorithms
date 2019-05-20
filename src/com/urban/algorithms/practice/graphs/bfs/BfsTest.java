package com.urban.algorithms.practice.graphs.bfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BfsTest {
    Bfs bfs;
    List<Vertex> vertices;

    @BeforeEach
    void setUp() {
        bfs = new Bfs();
        bfs.generateGraph();
        vertices = bfs.getVertices();
    }

    @Test
    void calculateDistanceBetweenTwoVertices() {

        assertEquals(3, bfs.calculateDistanceBetweenTwoVertices(vertices.get(0), vertices.get(8)));
    }

    @Test
    void selectVerticesOfVerticesInADistance() {
        assertEquals(5, bfs.selectVerticesOfVerticesInADistance(vertices.get(6), 2).size());
    }

    @Test
    void showShortestPathBetweenTwoVertices() {
    }
}