package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputScanner {
    private final List<List<Integer>> input = this.readInput();
    private final CheckData checkData = new CheckData();

    public InputScanner() {
    }

    private List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> input = new ArrayList();

        while(scanner.hasNextLine()) {
            List<Integer> row = new ArrayList();
            String scanRow = scanner.nextLine();
            if (scanRow.isEmpty()) {
                break;
            }

            Scanner rowScanner = new Scanner(scanRow);

            while(rowScanner.hasNext()) {
                int number = rowScanner.nextInt();
                row.add(number);
            }

            input.add(row);
        }

        return input;
    }

    public List<List<Integer>> getAdjacencyList() {
        if (this.checkData.checkIsAdjencyListIsFine(this.input)) {
            return (List)this.input.stream().map(Collection::stream).map((stream) -> {
                return (List)stream.skip(1L).collect(Collectors.toList());
            }).collect(Collectors.toList());
        } else {
            throw new IllegalArgumentException("Adjacency list have wrong data");
        }
    }

    public List<List<Integer>> getInput() {
        return this.input;
    }
}
