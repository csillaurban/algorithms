package com.urban.algorithms.practice.graphs.dfs;

import com.urban.algorithms.practice.graphs.bfs.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dfs dfs = new Dfs();
        dfs.generateGraph();
        List<Vertex> vertices = dfs.getVertices();
        dfs.iterativeDfs(vertices.get(0));
    }
}
