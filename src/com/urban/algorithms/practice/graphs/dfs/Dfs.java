package com.urban.algorithms.practice.graphs.dfs;

import com.urban.algorithms.practice.graphs.bfs.GraphGenerator;
import com.urban.algorithms.practice.graphs.bfs.Vertex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Dfs {
    private List<Vertex> vertices = new LinkedList<>();

    public void generateGraph() {
        GraphGenerator graphGenerator = new GraphGenerator();
        vertices = graphGenerator.populateGraph();
    }

    public void iterativeDfs(Vertex start) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (Vertex vertex: vertices
             ) {
            visited.put(vertex.getValue(), -1);
        }

        Stack<Vertex> stack = new Stack<>();

        visited.put(start.getValue(), 0);
        stack.push(start);

        while(!stack.isEmpty()) {
            Vertex current = stack.pop();
            System.out.println("Current in iterative: " + current.getValue());
            List<Vertex> neighbours = current.getAdjacency();
            for (Vertex vertex: neighbours
                 ) {
                if(visited.get(vertex.getValue()) == -1) {
                    visited.put(vertex.getValue(), visited.get(current.getValue()) + 1);
                    stack.push(vertex);
                }
            }

        }

    }

    /*public void recursiveDfs(Vertex start) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (Vertex vertex: vertices
        ) {
            visited.put(vertex.getValue(), -1);
        }

        Stack<Vertex> stack = new Stack<>();

        visited.put(start.getValue(), 0);
        stack.push(start);

        List<Vertex> adj = start.getAdjacency();

        while(!stack.isEmpty()) {

            if(adj.size() > 0) {

                for (Vertex vertex : adj
                ) {
                    if (visited.get(vertex.getValue()) == -1) {
                        System.out.println("Vertex: " + vertex.getValue());
                        visited.put(vertex.getValue(), visited.get(start.getValue()) + 1);
                        recursiveDfs(vertex);
                    }
                }

            } else {
                stack.pop();
            }

        }
    }*/

    public List<Vertex> getVertices() {
        return vertices;
    }
}
