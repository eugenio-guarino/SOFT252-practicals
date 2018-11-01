/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import java.util.ArrayList;
import utilities.IObserver;
import utilities.ISubject;

/**
 *
 * @author eguarino
 */
public abstract class StockItem implements ISubject{
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000000.00;
    protected Double costPrice = 1000000.00;
    private ArrayList<IObserver> observers = null;
    
    public abstract StockType getItemType();
    
    public StockItem()
    {
    
    }
    
    public StockItem(String name)
    {
        this.name = name;
    }
    
    public StockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
    
    public Boolean isInStock()
    {
        Boolean inStock = false;
        if (this.quantityInStock > 0){
            inStock = true;
        }
        return inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
            notifyObservers();
        }
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >= 0){
            this.quantityInStock = quantityInStock; 
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >= 0){
           this.sellingPrice = sellingPrice;            
        }

    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if (costPrice != null && costPrice >= 0){
            this.costPrice = costPrice;
        }

    }

    @Override
    public Boolean removeObserver(IObserver o)
    {
        Boolean blnRemoved = false;       
        if (o != null){
            if (this.observers != null && this.observers.size() > 0){
                blnRemoved = this.observers.remove(o);
            }
        }
        return blnRemoved;
    }

    @Override
    public Boolean registerObserver(IObserver o)
    {
        Boolean blnAdded = false;
        //validate that observer exists
        if (o != null){
            //If observer list not initialised create it
            if(this.observers == null){
                this.observers = new ArrayList <>();
            }
            //Add the observer to the list of registered observers
            blnAdded = this.observers.add(o);
        }
        //Return the result
        return blnAdded;
    }
    
       
    @Override
    public void notifyObservers(){
    //Ensure we have a valid list of observers
    if (this.observers != null && this.observers.size() > 0){
        //start foreach loop
        for (IObserver currentObserver : this.observers) {
            //Call update on this server
            currentObserver.update();
        }
    }   
}}
