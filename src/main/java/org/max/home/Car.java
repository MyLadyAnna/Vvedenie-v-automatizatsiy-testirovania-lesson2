package org.max.home;

public class Car implements Component {
    @Override
    public void print(){
        System.out.println("Машинка");
    }

    @Override
    public int getCountToy() {
        return 1;
    }
}
