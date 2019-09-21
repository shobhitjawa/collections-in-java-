import java.util.*;
public class ArrayList5{  
 public static void main(String[] args){  
    
  ArrayList<Integer> al=new ArrayList<Integer>();  
  al.add(1);
  al.add(2);  
  al.add(3); 
   al.add(3);
  al.add(4);  
  al.add(5); 
  ArrayList<Integer> l1=new ArrayList<Integer>();
  l1.addAll(al);
  Collections.reverse(l1);               //reverse a ArrayList.
  System.out.println(l1);
  
 }
}