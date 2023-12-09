package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        List < List < Integer > > matrix = inputScanner.getMatrix();
        Integer startVertex = inputScanner.getStartVertex();
        List < Integer > diameter = new ArrayList<>();
        for(int i = 0; i < matrix.size(); i++){
            Dijkstra dijkstra = new Dijkstra( matrix, i);
            diameter.add(dijkstra.getLongestShortestPath());
        }
        diameter.sort(Collections.reverseOrder());

    }
}
