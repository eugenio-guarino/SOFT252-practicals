/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;


 // An abstract template class for hot drinks, e.g. tea and coffee. 
 
public abstract class HotDrink implements MakeDrink {
    private String info;
    

    
    /**
     * A method for setting the information string for the clients.
     * 
     * @param inf a String for informing the client.
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * A method for setting the information string for the clients.
     * @return information 
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * The template method. It describes the algorithm for making a 
     * hot drink.
     * 
     * @return information 
     */
    @Override
    public final List <String> serveDrink() {
        
        List<String> steps = new ArrayList<>();
        steps.add(boilWater());       
        steps.add(brewDrink());
        steps.add(pourDrink());
        steps.add(addCondiments());
        steps.add(getInfo());
        return steps;
    }
    
    /**
     * A concrete implementation for common method: boiling water.
     * @return 
     */
    protected String boilWater() {
        String action = "Boiling some water...";
        return action;
    }
    
    /**
     * A concrete implementation for common method: pouring drinks.
     * @return 
     */
    protected String pourDrink() {
        String action = "Pouring your beverage into a cup...";
        return action;

    }
    
    /**
     * An abstract method for brewing drink: this is where the child algorithms
     * differ from each other.
     */
    protected abstract String brewDrink();
    
    /**
     * An abstract method for adding condiments: this is where the child algorithms
     * differ from each other.
     */
    protected abstract String addCondiments();
    
}
