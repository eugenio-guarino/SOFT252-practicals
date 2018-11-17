/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;


 // An abstract template class for simple drinks, i.e. bottled and tap drinks. 

public abstract class SimpleDrink implements MakeDrink{

    private String info;
    
    /**
     * A method for setting the information String for the clients. 
     * 
     * @param inf an information String. 
     */
    public void setInfo(String inf){
        info  = inf;
    }
    
    /**
     * A method to return the information string. 
     * 
     * @return information string. 
     */
    public String getInfo(){
        return info;
    }
    
    /**
     * A template method. It shows the steps required to serve a simple drink. 
     * 
     * @return information string.
     */
    @Override
    public final List <String> serveDrink() {
        List<String> steps = new ArrayList<>();
        steps.add(prepareDrink());
        steps.add(pourDrink());
        steps.add(getInfo());
        return steps;
    }
    
    /**
     * A concrete method for pouring drinks that is common across the subclasses. 
     * @return 
     */
    protected String pourDrink() {
        String action = "Pouring the drink...";
        return action;
    }
    
    /**
     * An abstract method for preparing drinks: each subclass must implement this. 
     * @return 
     */
    protected abstract String prepareDrink();
    
    
}
