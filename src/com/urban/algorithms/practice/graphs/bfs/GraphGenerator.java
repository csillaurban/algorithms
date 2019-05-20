package com.urban.algorithms.practice.graphs.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GraphGenerator {

    public List<Vertex> populateGraph() {
        List<Vertex> vertices = new LinkedList<>();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);
        v1.adjacencies.addAll(Arrays.asList(2, 3, 7));
        v2.adjacencies.addAll(Arrays.asList(1, 4));
        v3.adjacencies.addAll(Arrays.asList(1, 7, 8));
        v4.adjacencies.addAll(Arrays.asList(2, 9));
        v5.adjacencies.add(4);
        v6.adjacencies.add(4);
        v7.adjacencies.addAll(Arrays.asList(1, 3, 8));
        v8.adjacencies.addAll(Arrays.asList(7, 3, 9));
        v9.adjacencies.addAll(Arrays.asList(8, 4));
        vertices.addAll(Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9));
        return vertices;
    }
}
