package com.urban.algorithms.practice.graphs;

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
        v1.adjacency.addAll(Arrays.asList(v2, v3, v7));
        v2.adjacency.addAll(Arrays.asList(v1, v4));
        v3.adjacency.addAll(Arrays.asList(v1, v7, v8));
        v4.adjacency.addAll(Arrays.asList(v2, v9, v5, v6));
        v5.adjacency.add(v4);
        v6.adjacency.add(v4);
        v7.adjacency.addAll(Arrays.asList(v1, v3, v8));
        v8.adjacency.addAll(Arrays.asList(v7, v3, v9));
        v9.adjacency.addAll(Arrays.asList(v8, v4));
        vertices.addAll(Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9));
        return vertices;
    }
}
