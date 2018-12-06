/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author arahat
 */
public abstract class Receiver {
    protected boolean floatInAir = false;
    protected boolean visible = true;
 
    protected boolean isFloatInAir() {
        return floatInAir;
    }

    abstract void setFloatInAir(boolean floatInAir);

    protected boolean isVisible() {
        return visible;
    }

    abstract void setVisible(boolean visible);

}
