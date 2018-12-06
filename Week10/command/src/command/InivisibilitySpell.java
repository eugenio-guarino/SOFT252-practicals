/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.HashSet;

/**
 *
 * @author arahat
 */
public class InivisibilitySpell implements ICommand{
    private Receiver receiver;
    public InivisibilitySpell(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.setVisible(false);
    }

    @Override
    public void undo() {
        receiver.setVisible(true);
    }
    
}
