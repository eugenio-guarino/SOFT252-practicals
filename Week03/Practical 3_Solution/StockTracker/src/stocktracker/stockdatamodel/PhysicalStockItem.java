/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author rtucker
 */
public class PhysicalStockItem extends StockItem {
    
    public PhysicalStockItem(String name)
    {
        this.name = name;
    }
    
    public PhysicalStockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
}
