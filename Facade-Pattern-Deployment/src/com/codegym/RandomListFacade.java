package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    RandomList randomlist = new RandomList();
    ListFilter listFilter = new ListFilter();
    ListPrinter listPrinter = new ListPrinter();

    public void printRandomEvenList(){
        listPrinter.printList(listFilter.filterOdd(randomlist.generateList(100,1,1999)));
    }

}
