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
            for (int i = 0; i < neighbours.size(); i++) {
                if(neighbours.get(i) != null && visited.get(neighbours.get(i).getValue()) == -1) {
                    visited.put(neighbours.get(i).getValue(), 0);
                    stack.push(neighbours.get(i));
                }
            }
        }
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}
