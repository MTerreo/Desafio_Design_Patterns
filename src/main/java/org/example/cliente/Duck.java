package org.example.cliente;

import org.example.voo.FlyBehavior;
import org.example.som.QuackBehavior;

public abstract class Duck {
    /*
    Declara duas variaveis de referência para os
    tipos de interfaces de comportamentos
     */

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() { }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }  // Delega para a classe de comportamento.
    public void performQuack() {
        quackBehavior.quack();
    }  // Delega para a classe de comportamento.
    public void swim() {
        System.out.println("Todos os patos boiam, até os de brinquedo!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
