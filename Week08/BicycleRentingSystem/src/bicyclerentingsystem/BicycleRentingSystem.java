/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerentingsystem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class includes includes methods to add, remove and assign bikes.
 * @author Eugen
 */
public class BicycleRentingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Bicycle> bikePool;
        
        Scanner scan = new Scanner(System.in);
 
        Serialiser serialiser = new Serialiser("bike_pool.ser");

        bikePool = (ArrayList<Bicycle>) serialiser.readObject();

        while (true){        
            
            serialiser.writeObject(bikePool);
        
            System.out.println("**BICYCLE RENTING SYSTEM**");
            printPool(bikePool);
            System.out.println("");
            System.out.println("Please select an option");
            System.out.println("1: Assign bicycle");
            System.out.println("2: Remove bicycle");
            System.out.println("3: Add Bicycle");
            System.out.println("4: Quit");
        
            int option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:  bikePool = selectExtras(bikePool);
                    break;
                case 2:  bikePool = removeBicycle(bikePool);
                    break;
                case 3:  bikePool = addBicycle(bikePool);
                    break;
                case 4:  System.exit(0);
                    break;
            }
           
        } 
    }
   
    /**
     * A method that prints all the objects contained in the bikePool ArrayList
     * @param bikePool
     */
    public static void printPool(ArrayList<Bicycle> bikePool){              
        int i = 1;
        for (Bicycle bike : bikePool) 
        { 
            if (bike.getEmployeeID() == 0) {
                System.out.println(i +" "+ bike.getDescription() + " AVAILABLE");             
            }
            else{
                System.out.println(i +" "+ bike.getDescription() + " UNAVAILABLE" +" Employee ID:"+ bike.getEmployeeID());
            }
            
            i++;
        }
    }
    
    /**
     * A method that allow the user to select the extras 
     * @param bikePool
     * @return
     */
    public static ArrayList<Bicycle> selectExtras(ArrayList<Bicycle> bikePool){
        int bikeIndex = 0;
        String answer;
        
        Scanner scan = new Scanner(System.in);
        Bicycle bike = bikePool.get(bikeIndex);
        
        do{
        System.out.println("Please select available bicycle");
        bikeIndex = Integer.parseInt(scan.nextLine())-1;
        bike = bikePool.get(bikeIndex);
        }while (bike.getEmployeeID() == 0);
    
        System.out.println("Front light?");       
        answer = scan.nextLine();
        if ("yes".equals(answer)) {
            bike = new FrontLight(bikePool.get(bikeIndex));
            bikePool.set(bikeIndex, bike);
        }
        
        
        System.out.println("Hand pump?");
        answer = scan.nextLine();       
        if ("yes".equals(answer)) {
            bike = new HandPump(bikePool.get(bikeIndex));
            bikePool.set(bikeIndex, bike);

        }
        
        System.out.println("Helmet?");
        answer = scan.nextLine();
        if ("yes".equals(answer)) {
            bike = new Helmet(bikePool.get(bikeIndex));
            bikePool.set(bikeIndex, bike);
        }

        System.out.println("Back light?");
        answer = scan.nextLine();
        if ("yes".equals(answer)) {
            bike = new BackLight(bikePool.get(bikeIndex));
            bikePool.set(bikeIndex, bike);          
        }
               
        System.out.println("Provide ID");
        int ID = Integer.parseInt(scan.nextLine());       
        bike.setEmployeeID(ID);
        bikePool.set(bikeIndex, bike);  
        
        System.out.println(bike.getDescription() + ": " + bike.cost());
        System.out.println("");
        System.out.println("");
        
        return bikePool;        
    }
    
    /**
     * A method to remove a Bicycle object from the ArrayList
     * @param bikePool
     * @return
     */
    public static ArrayList<Bicycle> removeBicycle(ArrayList<Bicycle> bikePool){
        
        int bikeIndex = 0;     
        Scanner scan = new Scanner(System.in);
        Bicycle bike = bikePool.get(bikeIndex);
        
        do{
        System.out.println("Please select available bicycle");
        bikeIndex = Integer.parseInt(scan.nextLine())-1;
        bike = bikePool.get(bikeIndex);
        }while (bike.getEmployeeID() == 0);
        
        bikePool.remove(bikeIndex);
        return bikePool;
        
    }

     /**
     * A method to add a Bicycle object to the ArrayList
     * @param bikePool
     * @return
     */
    private static ArrayList<Bicycle> addBicycle(ArrayList<Bicycle> bikePool) {
        
        Bicycle bike = new Bicycle();     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Please select the type");
        System.out.println("1: Tandem");
        System.out.println("2: Folding");
        System.out.println("3: Touring");
        System.out.println("4: Road");
        
        int option = Integer.parseInt(scan.nextLine());

        switch (option) {
        case 1:  bike.setDescription("Tandem bicycle");
            break;
        case 2:  bike.setDescription("Folding bicycle");
            break;
        case 3:  bike.setDescription("Touring bicycle");
            break;
        case 4:  bike.setDescription("Road bicycle");
            break;
        }
        
        bikePool.add(bike);
        return bikePool;
    }

}
