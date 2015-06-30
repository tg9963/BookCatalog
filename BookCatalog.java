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
public class BookCatalog {

    /**
     * @param args the command line arguments
     */
    //Character ch='0';
    TrieNodes root1; //bookName Trie
    TrieNodes root2; //bookAuthor Trie
    HashMap<Integer,Book> BooksTable=new HashMap<Integer,Book>();
    
    
    public void setBookstable(HashMap<Integer,Book> BooksTable)
    {
        this.BooksTable=BooksTable;
    }
    
    public HashMap<Integer,Book> getBooksTable()
    {
        return this.BooksTable;
    }
    
    public void CreateTrie()
    {
        root1=new TrieNodes((Character)'0');
        root2=new TrieNodes((Character)'0');
        
        for(Integer key: BooksTable.keySet() )
        {
            Book book=BooksTable.get(key);
            String bookName=book.getBookName();
            String bookAuthor=book.getAuthor();
            insertIntoTrie(root1,bookName,book);
            insertIntoTrie(root2,bookAuthor,book);
        }
    }
    
    public void insertIntoTrie(TrieNodes root,String bookName,Book book)
    {
        int len=bookName.length();
        TrieNodes node=root;
        
        for(int level=0;level<len;level++)
        {
            HashMap<Character,TrieNodes> children=node.getChildren();
            if(children.containsKey(bookName.charAt(level)))
            {
                node=children.get(bookName.charAt(level));
            }
            else
            {
                TrieNodes newNode=new TrieNodes(bookName.charAt(level));
                children.put(bookName.charAt(level), newNode);
                node=newNode;
            }
            if(level==len-1)
            {
               node.setBookId(book.getBookId());
            }
        }
    }
    
    
    public String search(String name)
    {
        StringBuilder result=new StringBuilder();
        result.append("Search Results: \n");
        searchUtil(result,name,root1);
        //searchUtil(result,name,root2);
        //BooksFromThisNode(result,root1);
        result.append("\nEnd of Results");
        return result.toString();
    }
    
    public void searchUtil(StringBuilder result,String searchName,TrieNodes root)
    {
        int len=searchName.length();
        TrieNodes node=root;
        
        for(int level=0;level<len;level++)
        {
            HashMap<Character,TrieNodes> children=node.getChildren();
            if(children.containsKey(searchName.charAt(level)))
            {
                node=children.get(searchName.charAt(level));
                if(level!=len-1 && BooksTable.containsKey(node.getBookId()))
                 {
                     result.append("\n");
                     result.append(BooksTable.get(node.getBookId()).toString());
                     result.append("\n");
                 }
            }
            else
            {
                break ;
            }
        }

        BooksFromThisNode(result,node);
    }
    
    
    private void BooksFromThisNode(StringBuilder result, TrieNodes node)
    {
        TrieNodes crawl=node;
        HashMap<Character,TrieNodes> children=crawl.getChildren();
        //System.out.println("Hey");
        
        if(BooksTable.containsKey(crawl.getBookId()))
        {
                result.append("\n");
                result.append(BooksTable.get(crawl.getBookId()).toString());
                result.append("\n");
        }
        for(Character ch:children.keySet())
        {
                StringBuilder newResult=new StringBuilder();
                crawl=children.get(ch);
                BooksFromThisNode(newResult,crawl);
                //result.append("\n");
                result.append(newResult);
        }
    }
    
}
