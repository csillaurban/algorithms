package com.urban.algorithms.practice.graphs.bfs;

import java.util.LinkedList;
import java.util.List;

public class Bfs {

    private List<Vertex> vertices = new LinkedList<>();

    public void generateGraph() {
        GraphGenerator graphGenerator = new GraphGenerator();
        vertices = graphGenerator.populateGraph();
    }

    public void Bfs() {

    }

    public int calculateDistanceBetweenTwoVertices() {
        return 0;
    }

    public List selectVerticesOfVerticesInADistance() {
        return null;
    }

    public List showShortestPathBetweenTwoVertices() {
        return null;
    }
}
