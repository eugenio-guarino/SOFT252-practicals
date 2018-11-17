/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;

 // An abstract template class for alchoholic drinks, e.g. long drinks and cocktails.

public abstract class SpiritDrink implements MakeDrink {
  
    private String info;
    
    /**
     * An accessor method for setting the information string for clients. 
     * 
     * @param inf an information string.
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * An accessor method for getting the information string in the instance
     * variable. 
     * @return notification string.
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * The template method capturing the algorithm required for serving 
 SpecialDrink. 
     * 
     * @return An information string for notification once drink has been 
     * prepared. 
     */
    @Override
    public final List <String> serveDrink() {
        List<String> steps = new ArrayList<>();
        steps.add(addIce());
        steps.add(addAlcohol());
        steps.add(addMixer());
        steps.add(addGarnish());
        steps.add(getInfo());
        return steps;
    }
    
    /**
     * A concrete implementation of adding ice step. 
     * @return 
     */
    protected String addIce() {
        String action = "Adding ice...";
        return action;
    }
    
    /**
     * A concrete implementation of adding mixture step. 
     * @return 
     */
    protected String addMixer() {
        
        String action = "Adding mixer...";
        return action;
    }
    
    /**
     * An abstract method for adding alcohol.
     * @return 
     */
    protected abstract String addAlcohol();

    /**
     * An abstract method for adding garnish. 
     * @return 
     */
    protected abstract String addGarnish();
}
