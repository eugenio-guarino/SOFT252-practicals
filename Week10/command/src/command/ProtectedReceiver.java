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
public class ProtectedReceiver extends Receiver {
    
    @Override
    public void setFloatInAir(boolean floatInAir) {
        System.out.println("Nothing happened...");
    }

    @Override
    public void setVisible(boolean visible) {
        System.out.println("Nothing happened...");
    }
}
