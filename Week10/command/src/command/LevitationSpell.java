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
public class LevitationSpell implements ICommand{
    private Receiver receiver;
    public LevitationSpell(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.setFloatInAir(true);
    }

    @Override
    public void undo() {
        receiver.setFloatInAir(false);
    }
    
}
