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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Receiver Apple = new UnprotectedReceiver();
        ICommand invisible = new InivisibilitySpell(Apple);
        Invoker HarryPotter = new Invoker();
        HarryPotter.setCommand(invisible);
        System.out.println("Apple is visible: " + Apple.isVisible());
        System.out.println("Casting spell...");
        HarryPotter.castSpell();
        System.out.println("Apple is visible: " + Apple.isVisible());
        System.out.println("Reversing spell...");
        HarryPotter.undoSpell();
        System.out.println("Apple is visible: " + Apple.isVisible());
    }
    
}
