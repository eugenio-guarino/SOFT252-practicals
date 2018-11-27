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
public interface IState {

    public void presentCard(CashMachine aThis);

    public void printState();

    public void requestWithdraw(CashMachine aThis);

    public void refill(CashMachine aThis);

    public void inputPin(CashMachine aThis);

    public void depositMoney(CashMachine aThis);

    public void dispenseMoney(CashMachine aThis);

    public void removeCard(CashMachine aThis);
    
}
