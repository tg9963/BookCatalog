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
public class TestBookCatalog {
    
    public static void main(String[] args) {
        // TODO code application logic here
        InputHandler input=new InputHandler();
        input.setInputBooks();
        HashMap<Integer,Book> BooksTable=input.getBooksTable();
        
        BookCatalog catalog=new BookCatalog();
        catalog.setBookstable(BooksTable);
        
        catalog.CreateTrie();
        
        System.out.println(catalog.search("A"));
    }
}
