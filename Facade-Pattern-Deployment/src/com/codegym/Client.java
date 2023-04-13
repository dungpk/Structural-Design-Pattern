package com.codegym;

public class Client {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void Client(){

    }

    public Client(String name) {
        this.name = name;
    }

    RandomListFacade randomListFacade = new RandomListFacade();
    public void display(){
        randomListFacade.printRandomEvenList();
    }
}
