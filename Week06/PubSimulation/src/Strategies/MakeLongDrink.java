
package Strategies;
import Templates.SpiritDrink;

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
    protected void addAlcohol() {
        System.out.println("Adding Gin...");
    }

    /**
     * A concrete implementation of the adding garnish step in long drinks 
     * context. 
     */
    @Override
    protected void addGarnish() {
        System.out.println("Adding lemon ice...");
    }
    
}
