package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.generateGraph();
        List<Vertex> vertices = bfs.getVertices();
        bfs.bfs(vertices.get(0));
        Vertex start = vertices.get(0);
        Vertex end = vertices.get(8);
        bfs.calculateDistanceBetweenTwoVertices(start, end);
        bfs.selectVerticesOfVerticesInADistance(vertices.get(6), 2);
        bfs.showShortestPathBetweenTwoVertices(vertices.get(3), vertices.get(6));
    }
}
