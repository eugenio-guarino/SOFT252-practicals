/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerentingsystem;

/**
 *  A decorator class for front light. It extends Extra decorator interface.
 * @author Eugen
 */
public class FrontLight extends Extra {

    /**
     *
     * @param bicycle
     */
    public FrontLight(Bicycle bicycle) {
        super(bicycle);
    }

    /**
     *
     * @return
     */
    @Override
    public double cost() {
        return bicycle.cost() + 1.25;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return bicycle.getDescription() + ", Front Light";
    }
    
    
}
