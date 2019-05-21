package com.urban.algorithms.practice.graphs.bfs;

import com.urban.algorithms.practice.graphs.Graph;
import com.urban.algorithms.practice.graphs.Vertex;

import java.util.*;

public class BfsGraph extends Graph {

    public void bfs(Vertex startVertex) {
        //create visit map, -1: unvisited, key: value of vertex
        HashMap<Integer, Integer> visited = new HashMap<>();
        initVisitMap(visited);

        //create queue
        LinkedList<Vertex> queue = new LinkedList<>();

        //add the starting vertex to the queue and mark it as visited
        queue.add(startVertex);
        visited.put(startVertex.getValue(), 0);

        while(!queue.isEmpty()) {
            // get and remove the first element of the queue
            Vertex currentVertex = queue.poll();
            //get the neighbours of the current element
            List<Vertex> neighbours = currentVertex.getAdjacency();
            for(Vertex vertex: neighbours) {
                Integer key = vertex.getValue();
                //if the neighbour is not visited, mark as visited and add to the queue
                //visited value: current value + 1 -> register the distance from the starting vertex
                if(visited.get(key) == -1) {
                    visited.put(key, visited.get(currentVertex.getValue()) + 1);
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
            List<Vertex> neighbours = current.getAdjacency();
            for (Vertex vertex: neighbours
                 ) {
                Integer key = vertex.getValue();
                if(visited.get(key) == -1) {
                    visited.put(key, visited.get(current.getValue()) + 1);
                    //if the value of current vertex is equal to the value of destination vertex: vertex is found
                    if(vertex.getValue() == destination.getValue()) {
                        //return the distance
                        return visited.get(key);
                    } else {
                        //if not found, add the element to the queue
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
            List<Vertex> neighbours = current.getAdjacency();
            for (Vertex vertex: neighbours
                 ) {
                Integer key = vertex.getValue();
                if(visited.get(key) == -1) {
                    visited.put(key, visited.get(current.getValue()) + 1);
                    //if the element is in a distance
                    if(visited.get(key) <= distance) {
                        //add it to queue and the vertices in distance register
                        queue.add(vertex);
                        verticesInADistance.add(vertex);
                    } else {
                        //if its distance is bigger, stop exploring
                        break;
                    }
                }
            }
        }
        return verticesInADistance;
    }

    public List showShortestPathBetweenTwoVertices(Vertex start, Vertex destination) {
        LinkedList<Vertex> queue = new LinkedList<>();
        //this will give back the path:
        List<Vertex> shortestPath = new LinkedList<>();
        //it registers the relations during exploring:
        HashMap<Vertex, Vertex> childAndParent = new HashMap<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        initVisitMap(visited);

        queue.add(start);
        visited.put(start.getValue(), 0);

        while(!queue.isEmpty()) {
            Vertex current = queue.poll();
            List<Vertex> neighbours = current.getAdjacency();
            for (Vertex vertex: neighbours
                 ) {
                Integer key = vertex.getValue();
                if(visited.get(key) == -1) {
                    visited.put(key, visited.get(current.getValue()) + 1);
                    //put the vertex as a key and the previous/current element as a value to be able
                    //to detecting back the traces of the route
                    childAndParent.put(vertex, current);
                    if(vertex == destination) {
                        break;
                    } else {
                        queue.add(vertex);
                    }
                }
            }
        }

        //start tracing back
        shortestPath.add(destination);

        //the last element was: destination, to find the previous element, the destination vertex
        //will be key, and it value: previous element
        Vertex keyVertex = destination;

        for (int i = 0; i < childAndParent.size(); i++) {
            for (Vertex vertex: childAndParent.keySet()
            ) {
                if(vertex == keyVertex) {
                    //if we found the key, we found the previous element
                    //add it to the path register, than the value will be the key
                    //to continue the search for the previous element
                    shortestPath.add(childAndParent.get(keyVertex));
                    keyVertex = childAndParent.get(keyVertex);
                }
            }
        }
        return shortestPath;
    }




}
