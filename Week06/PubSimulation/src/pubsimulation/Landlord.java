/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;
import Strategies.*;

/**
 *
 * @author eguarino
 */
public class Landlord {
        // instance variables
    private MakeDrink strategy;
    private String greetings = "Hello!" +"\n"+
                                "What can I get you?";
    private String offerings = "We have: Pint, Bottle, Tea, "+
                                "Coffee, Long Drink, and Cocktail.";
    private String nullStrategyInfo = "You did not tell us what you would like! ";

    /**
     * The constructor for Landlord class. It sets the initial strategy to null. 
     */
    public Landlord() {
        this.strategy = null;
    }
    
    /**
     * An accessor method for the strategy property. 
     * @param strategy An IDrinksStrategy object
     */
    public void setStrategy(MakeDrink strategy){
        this.strategy = strategy;
    }
    
    /**
     * A static factory method for creating strategies. 
     * 
     * @param drinkType The type of drink from the user.
     * @return Selected strategy.
     */
    public static MakeDrink selectStrategy(String drinkType){
        MakeDrink strategy = null;
        switch (drinkType) {
            case "Pint":
                strategy = new Strategies.MakeTapDrink();
                break;
            case "Bottle":
                strategy = new Strategies.MakeBottleDrink();
                break;
            case "Tea":
                strategy = new Strategies.MakeTea();
                break;
            case "Coffee":
                strategy = new Strategies.MakeCoffee();
                break;
            case "Long Drink":
                strategy = new Strategies.MakeLongDrink();
                break;
            case "Cocktail":
                strategy = new Strategies.MakeCocktail();
                break;

        }
        return strategy;
    }
    
    /**
     * An accessor method for setting the greetings property.
     * 
     * @param s A string containing greetings from a Landlord. 
     */
    public void setGreetings(String s){
        greetings = s;
    }
    
    /**
     * An accessor method for getting the greetings property. 
     * @return greetings string. 
     */
    public String getGreetings(){
        return greetings;
    }

    /**
     * An accessor method for setting the offerings at the establishment. 
     * 
     * @param s a string containing the offerings at the establishment. 
     */
    public void setOfferings(String s){
        offerings = s;
    }
    
    /**
     * An accessor method to extract the offerings string in the instance 
     * variable. 
     * 
     * @return offerings string.
     */
    public String getOfferings(){
        return offerings;
    }
    
    /**
     * An accessor method facilitating the notification that no strategy (not 
     * even the default strategy) has been set. 
     * @return information string for null strategy.
     */
    public String getNullStrategyInfo(){
        return nullStrategyInfo;
    }

    /**
     * An accessor method for setting the information string for the null 
     * strategy. 
     * 
     * @param s information string for null strategy.
     */
    public void setNullStrategyInfo(String s){
        nullStrategyInfo = s;
    }
       

    /**
     * A method to ask the customer -- includes both greetings and offerings
     * in the instance variables. 
     * 
     * @return a string to pass on to the customer. 
     */
    public String askCustomer() {
        return getGreetings() + "\n" + getOfferings();
    }
    
    /**
     * A method that calls upon the strategy instance for serving drinks. 
     * 
     * @return an information string for the clients once the drink has been 
     * prepared. 
     */
    public String serveDrink() {
    
        if (this.strategy == null) {
            return getNullStrategyInfo();
        } else {
            return this.strategy.serveDrink();
        }
    }
   
    
}
