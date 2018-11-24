/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerentingsystem;

/**
 * A decorator class for hand pump. It extends Extra decorator interface.
 * @author Eugen
 */
public class HandPump extends Extra {

    /**
     *
     * @param bicycle
     */
    public HandPump(Bicycle bicycle) {
        super(bicycle);
    }

    /**
     *
     * @return
     */
    @Override
    public double cost() {
        return bicycle.cost() + 2;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return bicycle.getDescription() + ", Hand Pump";
    }
    

}
