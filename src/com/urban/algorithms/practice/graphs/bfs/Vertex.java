package com.urban.algorithms.practice.graphs.bfs;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    protected int value;
    protected List<Vertex> adjacency = new LinkedList<>();

    public Vertex(int value) {
        this.value = value;
    }


}
