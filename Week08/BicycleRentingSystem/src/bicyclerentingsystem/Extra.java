/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerentingsystem;

/**
 * Abstract decorator class extends the Bicycle class
 * @author Eugen
 */
public abstract class Extra extends Bicycle {
    
    Bicycle bicycle;

    /**
     *
     * @param bicycle
     */
    public Extra(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    
}
