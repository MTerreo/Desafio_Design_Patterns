package org.example;

import org.example.cliente.Duck;
import org.example.cliente.MallardDuck;
import org.example.cliente.ModelDuck;
import org.example.voo.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main( String[] args ) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); /* Isto chama o método performQuack() herdado da classe
        MallardDuck, que então delega ao QuackBehavior do objeto (ou seja, chama quack()
        na referência quackBehavior herdada da classe Duck). */
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        /* A primeira chamada do método performFly() delega ao objeto flyBehavior,
        definido no construtor do ModelDuck, o qual é uma instância FlyNoWay.  */
        model.setFlyBehavior(new FlyRocketPowered());
        /* Aqui é invocado o método setFlyBehavior herdado do modelo e... voilà!
        O modelo de repente tem capacidade de vôo impulsionado por foguete! */
        model.performFly();
        /* Aqui o modelo duck muda dinamicamente seu comportamento de voo. Note que
        não seria possível fazer isto se a implementação ficasse dentro da classe Duck */
    }
}
