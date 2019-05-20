package com.urban.algorithms.practice.graphs.bfs;

import java.util.*;

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

    public Integer calculateDistanceBetweenTwoVertices(Vertex start, Vertex destination) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();

        for (Vertex vertex: vertices
             ) {
            visited.put(vertex.value, -1);
        }

        visited.put(start.value, 0);
        queue.add(start);

        while(!visited.isEmpty()) {
            Vertex current = queue.poll();
            List<Vertex> adj = current.adjacency;
            for (Vertex vertex: adj
                 ) {
                if(visited.get(vertex.value) == -1) {
                    visited.put(vertex.value, visited.get(current.value) + 1);
                    if(vertex.value == destination.value) {
                        System.out.println("The distance between the two values: " + visited.get(vertex.value));
                        return visited.get(vertex.value);
                    } else {
                        queue.add(vertex);
                    }
                }
            }
        }
        return null;
    }

    public Set<Vertex> selectVerticesOfVerticesInADistance(Vertex start, int distance) {
        Set<Vertex> verticesInADistance = new HashSet<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();

        for (Vertex vertex: vertices
             ) {
            visited.put(vertex.value, -1);
        }

        visited.put(start.value, 0);
        queue.add(start);

        while(!queue.isEmpty()){
            Vertex current = queue.poll();
            List<Vertex> adj = current.adjacency;
            for (Vertex vertex: adj
                 ) {
                if(visited.get(vertex.value) == -1) {
                    visited.put(vertex.value, visited.get(current.value) + 1);
                    if(visited.get(vertex.value) <= distance) {
                        queue.add(vertex);
                        verticesInADistance.add(vertex);
                    } else {
                        break;
                    }
                }
            }
        }
        return verticesInADistance;
    }

    public List showShortestPathBetweenTwoVertices(Vertex start, Vertex destination) {
        return null;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}
