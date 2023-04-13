package com.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5522);
        numbers.add(252);
        numbers.add(5526262);
        numbers.add(77);
        numbers.add(55323522);
        numbers.add(222);
        numbers.add(554122);
        numbers.add(555522);
        numbers.add(55);
        numbers.add(764432);
        numbers.add(16876);

        System.out.println("Find max in array: ");
        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(numbers);
    }
}
