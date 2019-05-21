package com.urban.algorithms.practice.graphs.dfs;

import com.urban.algorithms.practice.graphs.Graph;
import com.urban.algorithms.practice.graphs.Vertex;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Dfs extends Graph {

    public void iterativeDfs(Vertex start) {
        //create a HashMap to store visited vertices and the length of the route
        //-1: unvisited
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (Vertex vertex: getVertices()
             ) {
            Integer key = vertex.getValue();
            visited.put(key, -1);
        }

        //create a stack
        Stack<Vertex> stack = new Stack<>();

        //put the starting vertex to the stack and mark as visited
        visited.put(start.getValue(), 0);
        stack.push(start);

        while(!stack.isEmpty()) {
            //get the top element and remove from the stack
            Vertex current = stack.pop();
            System.out.println("Current vertex: " + current.getValue());
            //get the neighbours of the current element
            List<Vertex> neighbours = current.getAdjacency();

            //if there are neighbours
            if(neighbours.size() > 0) {
                for (Vertex vertex: neighbours
                     ) {
                    Integer key = vertex.getValue();
                    //if a neighbour is not visited, mark as visited and push to the stack
                    if(visited.get(key) == -1) {
                        visited.put(key, 0);
                        stack.push(vertex);
                    }
                }
            }
        }
    }

}
