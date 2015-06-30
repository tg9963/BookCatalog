/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcatalog;

import java.util.*;

/**
 *
 * @author gtanguto
 */
public class SoldHandler {
    HashMap<Buyer,Book> SellerTable=new HashMap<Buyer,Book>();
    
    public void setSellerTable(HashMap<Buyer,Book> SellerTable)
    {
        this.SellerTable=SellerTable;
    }
    
    public HashMap<Buyer,Book> getSellerTable()
    {
        return this.SellerTable;
    }
    
}
