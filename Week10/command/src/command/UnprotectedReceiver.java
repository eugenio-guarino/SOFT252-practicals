/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author eguarino
 */
public class UnprotectedReceiver extends Receiver{
    
    @Override
    public void setFloatInAir(boolean floatInAir) {
        this.floatInAir = floatInAir;
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
