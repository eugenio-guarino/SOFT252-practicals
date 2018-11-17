/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.MakeDrink;

/**
 *
 * @author Eugen
 */
public class DrinkFactory {
    
        public static MakeDrink selectStrategy(String drinkType){
        MakeDrink strategy = null;
        switch (drinkType) {
            case "Pint":
                strategy = new model.MakeTapDrink();
                break;
            case "Bottle":
                strategy = new model.MakeBottleDrink();
                break;
            case "Tea":
                strategy = new model.MakeTea();
                break;
            case "Coffee":
                strategy = new model.MakeCoffee();
                break;
            case "Long Drink":
                strategy = new model.MakeLongDrink();
                break;
            case "Cocktail":
                strategy = new model.MakeCocktail();
                break;
        }
        return strategy;
    }
    
}
