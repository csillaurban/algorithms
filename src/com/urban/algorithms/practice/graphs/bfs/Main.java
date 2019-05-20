package com.urban.algorithms.practice.graphs.bfs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.generateGraph();
        List<Vertex> vertices = bfs.getVertices();
        bfs.bfs(vertices.get(0));
    }
}
