/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.MakeDrink;

/**
 *
 * @author eguarino
 */
public class Landlord {
    // instance variables   
    private MakeDrink strategy;
    private String greetings = "Hello!" +"\n"+
                                "What can I get you?";
    private String offerings = "We have: Pint, Bottle, Tea, \n"+
                                "Coffee, Long Drink, and Cocktail.";
    private List <String> nullStrategyInfo;


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
    

    
    public static MakeDrink communicateToFactory(String drink){
        DrinkFactory Factory = new DrinkFactory();
        MakeDrink theDrink = Factory.selectStrategy(drink);
        
        return theDrink;
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
    public List <String> serveDrink() {
        return this.strategy.serveDrink();
    }  
}
