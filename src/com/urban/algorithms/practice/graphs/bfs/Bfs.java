package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Graph;
import com.urban.algorithms.practice.graphs.GraphGenerator;
import com.urban.algorithms.practice.graphs.Vertex;

import java.util.*;

public class Bfs extends Graph {


    public void bfs(Vertex startVertex) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        initVisitMap(visited);

        queue.add(startVertex);
        visited.put(startVertex.getValue(), 0);

        while(!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            List<Vertex> adj = currentVertex.getAdjacency();
            for(Vertex vertex: adj) {
                if(visited.get(vertex.getValue()) == -1) {
                    visited.put(vertex.getValue(), visited.get(currentVertex.getValue()) + 1);
                    queue.add(vertex);
                }
            }
        }
    }

    public Integer calculateDistanceBetweenTwoVertices(Vertex start, Vertex destination) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        initVisitMap(visited);

        visited.put(start.getValue(), 0);
        queue.add(start);

        while(!visited.isEmpty()) {
            Vertex current = queue.poll();
            List<Vertex> adj = current.getAdjacency();
            for (Vertex vertex: adj
                 ) {
                if(visited.get(vertex.getValue()) == -1) {
                    visited.put(vertex.getValue(), visited.get(current.getValue()) + 1);
                    if(vertex.getValue() == destination.getValue()) {
                        return visited.get(vertex.getValue());
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
        initVisitMap(visited);

        visited.put(start.getValue(), 0);
        queue.add(start);

        while(!queue.isEmpty()){
            Vertex current = queue.poll();
            List<Vertex> adj = current.getAdjacency();
            for (Vertex vertex: adj
                 ) {
                if(visited.get(vertex.getValue()) == -1) {
                    visited.put(vertex.getValue(), visited.get(current.getValue()) + 1);
                    if(visited.get(vertex.getValue()) <= distance) {
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
        LinkedList<Vertex> queue = new LinkedList<>();
        List<Vertex> shortestPath = new LinkedList<>();
        HashMap<Vertex, Vertex> childAndParent = new HashMap<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        initVisitMap(visited);

        queue.add(start);
        visited.put(start.getValue(), 0);

        while(!queue.isEmpty()) {
            Vertex current = queue.poll();
            List<Vertex> adj = current.getAdjacency();
            for (Vertex vertex: adj
                 ) {
                if(visited.get(vertex.getValue()) == -1) {
                    visited.put(vertex.getValue(), visited.get(current.getValue()) + 1);
                    childAndParent.put(vertex, current);
                    if(vertex == destination) {
                        break;
                    } else {
                        queue.add(vertex);
                    }
                }
            }
        }

        shortestPath.add(destination);

        Vertex keyVertex = destination;

        for (int i = 0; i < childAndParent.size(); i++) {
            for (Vertex vertex: childAndParent.keySet()
            ) {
                if(vertex == keyVertex) {
                    shortestPath.add(childAndParent.get(keyVertex));
                    keyVertex = childAndParent.get(keyVertex);
                }
            }
        }
        return shortestPath;
    }



    private void initVisitMap(HashMap<Integer, Integer> visited) {
        for (Vertex vertex: getVertices()
        ) {
            visited.put(vertex.getValue(), -1);
        }
    }
}
