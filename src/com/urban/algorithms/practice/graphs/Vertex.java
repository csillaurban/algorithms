package com.urban.algorithms.practice.graphs;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    protected int value;

    protected List<Vertex> adjacency = new LinkedList<>();

    public Vertex(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Vertex> getAdjacency() {
        return adjacency;
    }


}
