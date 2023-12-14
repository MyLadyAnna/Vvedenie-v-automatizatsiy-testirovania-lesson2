package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HWTest {
    static Component car1;
    static Component car2;
    static Component doll1;
    static Component doll2;
    static Box box1;
    static Box box2;

    @BeforeAll
    static void setUp() {
        car1 = new Car();
        car2 = new Car();
        doll1 = new Doll();
        doll2 = new Doll();
        box1 = new Box();
        box2 = new Box();

        box1.addComponent(car1);
        box1.addComponent(car2);
        box2.addComponent(doll1);
        box2.addComponent(doll2);
        box1.addComponent(box2);
    }

    @Test
    void getCoponentsTest(){
        Assertions.assertEquals(3, box1.getComponents().size());
        Assertions.assertEquals(2, box2.getComponents().size());
    }

    @Test
    void getAllInBox1CountTest() {
        Assertions.assertEquals(4, box1.getCountToy());
    }

    @Test
    void getInBoxCountTest() {
        Assertions.assertEquals(2, box2.getCountToy());
    }

}
