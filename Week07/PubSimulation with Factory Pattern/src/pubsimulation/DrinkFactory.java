/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

import Strategies.MakeDrink;

/**
 *
 * @author Eugen
 */
public class DrinkFactory {
    
        public static MakeDrink selectStrategy(String drinkType){
        MakeDrink strategy = null;
        switch (drinkType) {
            case "Pint":
                strategy = new Strategies.MakeTapDrink();
                break;
            case "Bottle":
                strategy = new Strategies.MakeBottleDrink();
                break;
            case "Tea":
                strategy = new Strategies.MakeTea();
                break;
            case "Coffee":
                strategy = new Strategies.MakeCoffee();
                break;
            case "Long Drink":
                strategy = new Strategies.MakeLongDrink();
                break;
            case "Cocktail":
                strategy = new Strategies.MakeCocktail();
                break;

        }
        return strategy;
    }
    
}
