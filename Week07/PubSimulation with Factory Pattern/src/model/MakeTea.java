/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
     * @return 
     */
    @Override
    protected String brewDrink() {
        String action = "Steeping teabag...";
        return action;
    }

    /**
     * A concrete implementation of adding condiments step. 
     * @return 
     */
    @Override
    protected String addCondiments() {
        String action = "Adding lemon";
        return action;
    }
    
}
