/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;

/**
 *
 * @author rtucker
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Physical Stock Item object and a Service Stock Item object
        PhysicalStockItem objPhysicalItem = 
                new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 0);
        ServiceStockItem objVirtualItem =
                new ServiceStockItem("Wintersmith: A Diskworld eBook by Terry Pratchett");
        
        //Test the behaviour of the Physical Stock Item
        String strMessage = objPhysicalItem.getName() 
                + ", Is in stock = " + objPhysicalItem.isInStock() 
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        //Test the behaviour of the Service Stock Item
        strMessage = objVirtualItem.getName() 
                + ", Is in stock = " + objVirtualItem.isInStock() 
                + ", Qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
}
