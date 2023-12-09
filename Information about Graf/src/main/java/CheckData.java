package main.java;

import java.util.Iterator;
import java.util.List;

public class CheckData {
    public CheckData() {
    }

    public boolean checkIsAdjencyListIsFine(List<List<Integer>> input) {
        int j = 0;

        for(int i = 1; i < input.size() + 1; ++j) {
            if (i != (Integer)((List)input.get(j)).getFirst()) {
                return false;
            }

            ++i;
        }

        Iterator var7 = input.iterator();

        while(var7.hasNext()) {
            List<Integer> row = (List)var7.next();
            Iterator var5 = row.iterator();

            while(var5.hasNext()) {
                Integer neighbour = (Integer)var5.next();
                if (neighbour > input.size()) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkIsStartVertexIsFine(List<List<Integer>> input, Integer startVertex) {
        if (startVertex < (Integer)((List)input.getFirst()).getFirst()) {
            return false;
        } else {
            return startVertex <= (Integer)((List)input.getLast()).getFirst();
        }
    }
}
