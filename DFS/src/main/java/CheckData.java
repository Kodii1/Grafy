package main.java;

import java.util.List;

public class CheckData{

    public boolean checkIsAdjencyListIsFine(List < List < Integer > > input){
        int j = 0;
        for( int i = 1; i < input.size() + 1; i++ , j++){
            if(i != input.get(j).getFirst()){
                return false;
            }
        }
        for(List < Integer > row : input){
            for(Integer neighbour : row){
                if(neighbour > input.size()){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean checkIsStartVertexIsFine(List < List < Integer > > input ,Integer startVertex){
        if(!(startVertex >= input.getFirst().getFirst())){
            return false;
        }
        return startVertex <= input.getLast().getFirst();
    }
}
