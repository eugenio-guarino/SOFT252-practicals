/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author Eugen
 */
public class BankAccount {
    private double balance;
    private double overdraft;
    private String holder; 
    
    public BankAccount (String Holder) {
        this.holder = Holder;
        this.overdraft = 500;
        this.balance = 100;
    }
    
    public void depositMoney(int amount) {
        balance += amount;
        
    }
    
    public boolean withdrawMoney (int amount){
        if ((balance + overdraft) < amount)
            return false;
        else {
            balance -= amount;
            return true;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getHolder(){
        return holder;
    }
    
    public double getOverdraft(){
        return overdraft;
    }
    
    public void setOverdraft(int overdraft){
        this.overdraft = overdraft;
    }
}
