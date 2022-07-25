package org.example.voo;

/*
Esta é a implementação para patos que não voam (por exemplo,
os patos de borracha e os patos de decoração)
*/

import org.example.voo.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
