package org.example.voo;

/*
Esta é a implementação para patos que realmente voam
*/

import org.example.voo.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
