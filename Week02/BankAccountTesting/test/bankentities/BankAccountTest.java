/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eguarino
 */
public class BankAccountTest {
    
    private BankAccount test1;
    private BankAccount test2;
    private BankAccount lessThanBalance;
    private BankAccount inTheBalance;
    private BankAccount overAllCredit;
    private BankAccount OVER;
    
    
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        test1 = new BankAccount("John");
        test2 = new BankAccount("Elizabeth");
        lessThanBalance = new BankAccount("Peter");
        inTheBalance = new BankAccount("Richard");
        overAllCredit = new BankAccount("Donald Duck");
        OVER = new BankAccount("Donald Trump");
        
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDepositMoney() {
        
        System.out.println("Testing deposit!");
        
        test1.depositMoney(100);
        
        assertEquals("Balance should be 210", 210, test1.getBalance());
        
    }

    @Test
    public void testWithdrawMoney() {
        
        System.out.println("Testing correct balance after withdrawal");
        
        test2.withdrawMoney(100);
                
        assertEquals("balance should be 10", 10, test2.getBalance());
        
    }

    @Test
    public void testWithdrawalIsOK() {
        System.out.println("Testing correct amount");
              
        assertEquals("It should return true", true, lessThanBalance.withdrawalIsOK(100));
        
        assertEquals("It should return true", true, inTheBalance.withdrawalIsOK(110));
        
        assertEquals("It should return true", true, overAllCredit.withdrawalIsOK(610));
        
        assertEquals("It should return false", false, OVER.withdrawalIsOK(1000));
        
        
        
    }

    @Test
    public void testGetBalance() {
    }

    @Test
    public void testGetHolder() {
    }

    @Test
    public void testGetOverdraft() {
    }

    @Test
    public void testSetOverdraft() {
    }
    
}
