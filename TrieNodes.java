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
public class TrieNodes {
    Character ch;
    HashMap<Character,TrieNodes> children=new HashMap<Character,TrieNodes>();
    boolean isEnd;
    int BookId;
    
    public TrieNodes(Character ch)
    {
        setCharacter(ch);
        setBookId(-1);
        isEnd=false;
    }
    
    public void setCharacter(Character ch)
    {
        this.ch=ch;
    }
    public Character getCharacter()
    {
        return this.ch;
    }
    
    public void setChildren(HashMap<Character,TrieNodes> children)
    {
        this.children=children;
    }
    
    public HashMap<Character,TrieNodes> getChildren()
    {
        return children;
    }
    
    public void setEnd()
    {
        this.isEnd=true;
    }
    
    public boolean isLeaf()
    {
        return isEnd==true;
    }    
    
    public int getBookId()
    {
     return this.BookId;   
    }
    
    public void setBookId(int BookId)
    {
        this.BookId=BookId;
    }
    
}
