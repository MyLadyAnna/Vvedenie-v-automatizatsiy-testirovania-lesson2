package org.max.home;

public class Doll implements Component {

    @Override
    public void print() {
        System.out.println("Кукла");
    }

    @Override
    public int getCountToy() {
        return 1;
    }
}
