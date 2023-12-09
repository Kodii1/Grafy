package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph {
    private final List<List<Integer>> adjacencyList;
    private final Integer numberOfVertexes;

    public Graph(List<List<Integer>> adjacencyList) {
        this.adjacencyList = adjacencyList;
        this.numberOfVertexes = adjacencyList.size();
    }

    public Integer getNumberOfEdges() {
        int v = 0;

        List row;
        for(Iterator var2 = this.adjacencyList.iterator(); var2.hasNext(); v += row.size()) {
            row = (List)var2.next();
        }

        return v / 2;
    }

    public List<Integer> getVertexDegrees() {
        List<Integer> degrees = new ArrayList();
        Iterator var2 = this.adjacencyList.iterator();

        while(var2.hasNext()) {
            List<Integer> integers = (List)var2.next();
            degrees.add(integers.size());
        }

        return degrees;
    }

    public Number getAvgVertexDegree() {
        List<Integer> degrees = this.getVertexDegrees();
        double avgDegree = 0.0;

        Integer degree;
        for(Iterator var4 = degrees.iterator(); var4.hasNext(); avgDegree += (double)degree) {
            degree = (Integer)var4.next();
        }

        avgDegree /= (double)degrees.size();
        return avgDegree;
    }

    public boolean isComplete() {
        for(int i = 0; i < this.adjacencyList.size(); ++i) {
            if (((List)this.adjacencyList.get(i)).size() != this.adjacencyList.size() - 1) {
                return false;
            }
        }

        return true;
    }

    public boolean isCycle() {
        Iterator var1 = this.adjacencyList.iterator();

        List integers;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            integers = (List)var1.next();
        } while(integers.size() == 2);

        return false;
    }

    public boolean isPath() {
        List<Integer> degrees = this.getVertexDegrees();
        int firstDegreeCount = 0;
        Iterator var3 = degrees.iterator();

        while(var3.hasNext()) {
            Integer degree = (Integer)var3.next();
            if (degree > 2) {
                return false;
            }

            if (degree == 1) {
                ++firstDegreeCount;
            }
        }

        return firstDegreeCount == 2;
    }

    public boolean isTree() {
        if (this.isCycle()) {
            return false;
        } else {
            Iterator var1 = this.getVertexDegrees().iterator();

            Integer degree;
            do {
                if (!var1.hasNext()) {
                    return this.getNumberOfEdges() == this.adjacencyList.size() - 1;
                }

                degree = (Integer)var1.next();
            } while(degree != 0);

            return false;
        }
    }

    public List<List<Integer>> getAdjacencyList() {
        return this.adjacencyList;
    }

    public Integer getNumberOfVertexes() {
        return this.numberOfVertexes;
    }
}
