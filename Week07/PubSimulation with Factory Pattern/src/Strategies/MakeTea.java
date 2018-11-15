/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;
import Templates.HotDrink;

 // A concrete class implementing the CaffeinatedDrink template class. 

public class MakeTea extends HotDrink implements MakeDrink {

    /** 
     * The constructor here sets the information string for the clients once
     * the drink has been prepared. 
     */
    public MakeTea(){
        String inf = "Here is your tea.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete method for brewing tea -- different from brewing coffee. 
     */
    @Override
    protected void brewDrink() {
        System.out.println("Steeping teabag...");
    }

    /**
     * A concrete implementation of adding condiments step. 
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
    
}
