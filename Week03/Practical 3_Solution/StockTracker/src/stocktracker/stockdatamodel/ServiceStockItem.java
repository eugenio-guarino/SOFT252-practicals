/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author rtucker
 */
public class ServiceStockItem extends StockItem {
    
    public ServiceStockItem(String name)
    {
        this.name = name;
    }
    
    public ServiceStockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }

    @Override
    public Boolean isInStock() {
        return true;
    }
}
