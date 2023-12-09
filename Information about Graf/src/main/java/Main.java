package main.java;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        new Graph(inputScanner.getAdjacencyList());
    }
}
