package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(4, bfs.showShortestPathBetweenTwoVertices(vertices.get(3), vertices.get(6)).size());
    }
}