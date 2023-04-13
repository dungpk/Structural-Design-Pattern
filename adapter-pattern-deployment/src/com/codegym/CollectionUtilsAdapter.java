package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers){
        List<Integer> targetList = new ArrayList<>(numbers);
        return targetList.stream().max(Integer::compare).get();
    }
}
