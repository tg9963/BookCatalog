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
public class Buyer {
    
    public String BuyerName;
    List<Book> books=new ArrayList<Book>();
    //Book book=null;
    
     public void setBuyerName(String BuyerName)
    {
        this.BuyerName=BuyerName;
    }
    public String getBuyerName()
    {
        return this.BuyerName;
    }
    
    public void setBooks(List<Book> books)
    {
        this.books=books;
    }
    
    public List<Book> getBooks()
    {
        return books;
    }
    
    public void addBook(Book book)
    {
        this.books.add(book);
    }
}
