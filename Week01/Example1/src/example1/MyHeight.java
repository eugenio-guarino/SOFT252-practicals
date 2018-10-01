/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author eguarino
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cms = 170;
        int totalInches = (int)Math.round(cms / 2.54);
        
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        
        System.out.println("Your height is " + feet + " feet and " + inches+ " inches");
        
    }
    
}
