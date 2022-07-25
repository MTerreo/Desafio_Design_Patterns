package org.example.cliente;
/*
A classe MallardDuck usa a classe Quack para gerar seu quack, assim quando
o método performQuack() é chamado, a responsabilidade para gerar o quack é
delegada para o objeto Quack e assim obtemos um quack.
*/

import org.example.voo.FlyWithWings;
import org.example.som.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        display();
        swim();
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
/*
A classe MallardDuck herda as variáveis de instancia quackBehavior e
flyBehavior da classe Duck.
A classe MallardDuck usa FlyWithWings() como seu tipo de FlyBehavior.
*/