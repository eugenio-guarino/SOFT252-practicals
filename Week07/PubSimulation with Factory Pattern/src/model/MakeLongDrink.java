
package model;
import view.PubSimulation;

 // A concrete class for the template class. 

public class MakeLongDrink extends SpiritDrink {

    /**
     * The constructor here sets the information string for notification once
     * the drink has been prepared. 
     */
    public MakeLongDrink(){
        String inf = "Here is your longdrink.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the adding alcohol step in long drinks 
     * context. 
     */
    @Override
    protected String addAlcohol() {
        String action = "Adding Gin...";
        return action;
    }

    /**
     * A concrete implementation of the adding garnish step in long drinks 
     * context. 
     */
    @Override
    protected String addGarnish() {
        String action = "Adding lemon ice...";
        return action;
    }
    
}
