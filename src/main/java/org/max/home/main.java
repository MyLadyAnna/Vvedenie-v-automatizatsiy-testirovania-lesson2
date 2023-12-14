package org.max.home;

public class main {
    public static void main(String[] args) {
        Component car1 = new Car();
        Component car2 = new Car();
        Component car3 = new Car();
        Component doll1 = new Doll();
        Component doll2 = new Doll();
        Component doll3 = new Doll();

        Box box1 = new Box();
        Box box2 = new Box();

        box1.addComponent(car1);
        box1.addComponent(car2);
        box1.addComponent(doll1);

        box2.addComponent(car3);
        box2.addComponent(doll2);
        box2.addComponent(doll3);

        box1.print();

        System.out.println(box1.getCountToy());
    }
}
