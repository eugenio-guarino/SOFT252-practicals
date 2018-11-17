
package model;
 
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
    protected String addAlcohol() {
        String action = "Adding Tequila and Gin...";
        return action;
    }

    /**
     * A concrete implementation of the garnish adding step in cocktail context.
     */
    @Override
    protected String addGarnish() {
        String action = "Adding fruits, straws, and little umbrellas...";
        return action;
    }
    
}
