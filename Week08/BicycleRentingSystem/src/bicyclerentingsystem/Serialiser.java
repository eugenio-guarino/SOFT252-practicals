package bicyclerentingsystem;
import java.io.*;

/**
 * Serialiser class to save the pool of bikes after the program terminates.
 * @author Eugen
 */
public class Serialiser {
    
    private String name;
    
    Serialiser(String filename){
        name = filename;
    }
    
    /**
     *
     * @param filename
     */
    public void setName(String filename){
        name = filename;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method reads the file and returns the List that contains 
     * the pool of bikes
     * @return
     */
    public Serializable readObject(){
        Serializable loadedObject = null;
        try {
         FileInputStream fileIn = new FileInputStream(name);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         loadedObject = (Serializable) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("Data loaded from: "+ name);
        } 
        catch (IOException i) {
            System.out.println("File not found.");
        } 
        catch (ClassNotFoundException c) {
            System.out.println("Class not found");
        }
        return loadedObject;
    }
    
    /**
     * This method saves the list into a file
     * @param object
     * @return
     */
    public boolean writeObject(Serializable object){
        try {
            FileOutputStream fileOut = new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in: " + name);
            return true;
         } 
        catch (IOException i) {
            System.out.println("Failed to load!");
            return false;
         }
    }
    
}
