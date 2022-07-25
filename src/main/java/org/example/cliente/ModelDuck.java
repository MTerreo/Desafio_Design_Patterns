package org.example.cliente;

import org.example.voo.FlyNoWay;
import org.example.som.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        display();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}
