import java.util.*;
public class ArrayList5{  
 public static void main(String[] args){  
    
  ArrayList<Integer> al=new ArrayList<Integer>();  
  al.add(43);
  al.add(421);  
  al.add(1); 
  ArrayList<Integer> l1=new ArrayList<Integer>();
  l1.addAll(al);        
   System.out.println(l1); 
   Collections.sort(l1);        //sort a arrayList.
   System.out.println(l1);
  
 }  
}  