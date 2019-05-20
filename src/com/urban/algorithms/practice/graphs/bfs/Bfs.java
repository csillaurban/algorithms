package com.urban.algorithms.practice.graphs.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Bfs {

    private List<Vertex> vertices = new LinkedList<>();

    public void generateGraph() {
        GraphGenerator graphGenerator = new GraphGenerator();
        vertices = graphGenerator.populateGraph();
    }

    public void bfs(Vertex startVertex) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        for (Vertex vertex: vertices
             ) {
            visited.put(vertex.value, -1);
        }

        queue.add(startVertex);
        visited.put(startVertex.value, 0);

        while(!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            List<Vertex> adj = currentVertex.adjacency;
            for(Vertex vertex: adj) {
                if(visited.get(vertex.value) == -1) {
                    visited.put(vertex.value, 0);
                    queue.add(vertex);
                }
            }
        }
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

    public List<Vertex> getVertices() {
        return vertices;
    }
}
