
package Strategies;
import Templates.SpiritDrink;

// A concrete implementation of the template class. 
 
public class MakeCocktail extends SpiritDrink {

    /**
     * The constructor here sets the information string in the instance variable.
     */
    public MakeCocktail(){
        String inf = "Here is your cocktail.";
        super.setInfo(inf);
    }
    
    /**
     * A concrete implementation of the add alcohol step in cocktail context. 
     */
    @Override
    protected void addAlcohol() {
        System.out.println("Adding Tequila and Gin...");
    }

    /**
     * A concrete implementation of the garnish adding step in cocktail context.
     */
    @Override
    protected void addGarnish() {
        System.out.println("Adding fruits, straws, and little umbrellas...");
    }
    
}
