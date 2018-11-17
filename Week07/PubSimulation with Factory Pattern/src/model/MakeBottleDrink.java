/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
 
public class MakeBottleDrink extends SimpleDrink {

    /**
     * The constructor for MakeBottleDrink -- it sets the information property 
     * in the template class for clients. 
     */
    public MakeBottleDrink(){
        String inf = "Here is your bottle.";
        super.setInfo(inf);
    }

    /**
     * This method provides a concrete implementation of the abstract method 
     * in the template class. 
     */
    @Override
    protected String prepareDrink() {
        String action = "Opening the bottle...";
        return action;
    }
    
}
