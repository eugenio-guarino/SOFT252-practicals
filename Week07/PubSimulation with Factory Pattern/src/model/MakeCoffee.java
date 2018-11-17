/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class MakeCoffee extends HotDrink{

    /**
     * The constructor for MakeCoffee -- it sets the information string 
     * from the template class for the clients. 
     */
    public MakeCoffee(){
        String inf = "Here is your coffee.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of brewing drinks. 
     */
    @Override
    protected String brewDrink() {
        String action = "Brewing the coffee";
        return action;
    }

    /**
     * A concrete implementation of adding condiments. 
     */
    @Override
    protected String addCondiments() {
        String action = "Adding milk and sugar";
        return action;
    }
    
}