/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcatalog;

/**
 *
 * @author gtanguto
 */
public class Book {
    
    public String BookName;
    public String Author; //make author as separate class and create list of books he wrote
    public String Publisher; //same as author
    public int YearOfPublish; 
    public String Category; // same as author
    public int price;
    public int BookId;
    private static int Count;
    
    
    
    
    public void setBookName(String BookName)
    {
        this.BookName=BookName;
    }
    
    public void setBookId(int BookId)
    {
        this.BookId=BookId;
    }
    
    public int getBookId()
    {
        return this.BookId;
    }
    
    public String getBookName()
    {
        return this.BookName;
    }
    public void setAuthor(String Author)
    {
        this.Author=Author;
    }
    public String getAuthor()
    {
        return this.Author;
    }
    public void setPublisher(String Publisher)
    {
        this.Publisher=Publisher;
    }
    public String getPublisher()
    {
        return this.Publisher;
    }
    
    public void setPublishYear(int YearOfPublish)
    {
     this.YearOfPublish=YearOfPublish;   
    }
    
    public int getPublishYear()
    {
        return this.YearOfPublish;
    }
    
    public void setCategory(String Catagory)
    {
        this.Category=Catagory;
    }
    
    public String getCategory()
    {
        return this.Category;
    }
    
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public static int getCount()
    {
        return Count;
    }
    
    public void incCount()
    {
        Count++;
    }
    
    @Override
    public String toString()
    {
        String result = "BookId: "+this.getBookId()+", \n"+"Name of Book: "+this.getBookName()+", \n"+" Author of the Book: "+this.getAuthor()
                +", \n"+" Publisher of the Book: "+this.getPublisher()+", \n"+" Published in: "+this.getPublishYear()
                +", \n"+" Catagory: "+this.getCategory()+", \n"+" Price: "+this.getPrice()+", \n";
        
        return result;
    }
    
}
