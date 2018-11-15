/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;
import Templates.SimpleDrink;

 // A concrete class implementing the SimpleDrink template class. 

public class MakeTapDrink extends SimpleDrink implements MakeDrink{

    /**
     * The constructor here sets the information string for notification. 
     */
    public MakeTapDrink(){
        String inf = "Here is your pint.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the preparing dirnk step in Tap drink 
     * context. 
     */
    @Override
    protected void prepareDrink() {
        System.out.println("Putting pint glass under tap...");
    }
    
}
