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
  int x=al.indexOf(4);   //print index of a element.
  System.out.println(x);
  ArrayList<Integer> l1=new ArrayList<Integer>();
  l1.addAll(al);
  Collections.reverse(l1); 
  System.out.println(l1);
  
 }
}