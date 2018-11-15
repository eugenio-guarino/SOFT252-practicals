/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;
import Templates.HotDrink;

// A strategy class for coffee. It extends HotDrink template class.

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
    protected void brewDrink() {
        System.out.println("Brewing the coffee");
    }

    /**
     * A concrete implementation of adding condiments. 
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
    
}