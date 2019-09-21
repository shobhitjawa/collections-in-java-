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
  ArrayList<Integer> l2=new ArrayList<Integer>();
   for(Integer x:al)
   {
       if(l1.contains(x)==false)
       {
           l1.add(x);
       }                   //remove duplicates from a arraylist.
   }
   System.out.print(l1);
 }  
}  