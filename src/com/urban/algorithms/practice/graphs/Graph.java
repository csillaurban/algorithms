package com.urban.algorithms.practice.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices = new LinkedList<>();

    public void generateGraph() {
        GraphGenerator graphGenerator = new GraphGenerator();
        vertices = graphGenerator.populateGraph();
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void initVisitMap(HashMap<Integer, Integer> visited) {
        for (Vertex vertex: getVertices()
        ) {
            visited.put(vertex.getValue(), -1);
        }
    }
}
