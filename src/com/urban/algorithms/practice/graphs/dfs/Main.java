package com.urban.algorithms.practice.graphs.dfs;

import com.urban.algorithms.practice.graphs.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DfsGraph dfs = new DfsGraph();
        dfs.generateGraph();
        List<Vertex> vertices = dfs.getVertices();
        dfs.iterativeDfs(vertices.get(0));
    }
}
