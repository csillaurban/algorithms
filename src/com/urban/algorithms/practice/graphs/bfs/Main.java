package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BfsGraph bfsGraph = new BfsGraph();
        bfsGraph.generateGraph();
        List<Vertex> vertices = bfsGraph.getVertices();
        bfsGraph.bfs(vertices.get(0));
        Vertex start = vertices.get(0);
        Vertex end = vertices.get(8);
        bfsGraph.calculateDistanceBetweenTwoVertices(start, end);
        bfsGraph.selectVerticesOfVerticesInADistance(vertices.get(6), 2);
        bfsGraph.showShortestPathBetweenTwoVertices(vertices.get(3), vertices.get(6));
    }
}
