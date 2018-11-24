/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerentingsystem;
import java.io.Serializable;

/**
 * A class for bicycle. It implements the Serializable interface.
 * @author Eugen
 */
public class Bicycle implements Serializable{
    
    private String description;
    private int employeeID;

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param employeeID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     *
     * @return
     */
    public int getEmployeeID() {
        return employeeID;
    }
    
    /**
     *
     * @return
     */
    public String getDescription() {
        return this.description;
    }
 
    /**
     *
     * @return
     */
    public double cost(){        
        return 10;
    }
    
    
}
