/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmSimulator;

/**
 *
 * @author eguarino
 */
public class CashMachine {
    private IState state;
    
    public CashMachine(IState state) {
    this.state = state;
    }
    public void setState(IState state) {
    this.state = state ;
    }
    public void presentCard() {
    state.presentCard (this) ;
    }
    public void removeCard() {
    state.removeCard(this) ;
    }
    public void depositMoney() {
    state.depositMoney(this) ;
    }
    public void inputPin() {
    state.inputPin(this) ;
    }
    public void requestWithdraw() {
    state.requestWithdraw(this) ;
    }
    public void refill() {
    state.refill(this) ;
    }
    public void dispenseMoney() {
    state.dispenseMoney(this) ;
    }
    public void printState() {
    this.state.printState() ;
    }
    
    
}
