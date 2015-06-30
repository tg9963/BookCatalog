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
public class InputHandler {
    
    HashMap<Integer,Book> BooksTable=new HashMap<Integer,Book>();
    
    public void setBookstable(HashMap<Integer,Book> BooksTable)
    {
        this.BooksTable=BooksTable;
    }
    
    public HashMap<Integer,Book> getBooksTable()
    {
        return this.BooksTable;
    }
    
    public void setInputBooks()
    {
        Book book1=new Book();
        book1.setBookName("Arihant");
        book1.setAuthor("Gopinath");
        book1.setPublisher("DESHAA");
        book1.setPublishYear(2010);
        book1.setCategory("Education");
        book1.setBookId(1);
        book1.setPrice(500);
        
        Book book2=new Book();
        book2.setBookName("Ari");
        book2.setAuthor("Naganath");
        book2.setPublisher("DBsha");
        book2.setPublishYear(2012);
        book2.setCategory("Moral");
        book2.setBookId(2);
        book2.setPrice(1420);
        
        Book book3=new Book();
        book3.setBookName("Before Sucess");
        book3.setAuthor("Kishore");
        book3.setPublisher("LakshmanPublications");
        book3.setPublishYear(1999);
        book3.setCategory("Entertainment");
        book3.setBookId(3);
        book3.setPrice(3250);
        
        Book book4=new Book();
        book4.setBookName("ZebraDance");
        book4.setAuthor("Zera");
        book4.setPublisher("HarishPubLtd");
        book4.setPublishYear(2011);
        book4.setCategory("AnimalScience");
        book4.setBookId(4);
        book4.setPrice(100);
        
        BooksTable.put(book1.getBookId(), book1);
        BooksTable.put(book2.getBookId(), book2);
        BooksTable.put(book3.getBookId(), book3);
        BooksTable.put(book4.getBookId(), book4);
    }
    
}
