package com.urban.algorithms.practice.graphs.bfs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.generateGraph();
        List<Vertex> vertices = bfs.getVertices();
        bfs.bfs(vertices.get(0));
        Vertex start = vertices.get(0);
        Vertex end = vertices.get(8);
        System.out.println("Start: " + start.value + " - end: " + end.value);
        bfs.calculateDistanceBetweenTwoVertices(start, end);
    }
}
