import java.util.*;
public class ArrayList5{  
 public static void main(String[] args){  
    
  ArrayList<Integer> al=new ArrayList<Integer>();  
  al.add(43);
  al.add(421);  
  al.add(1); 
  ArrayList<Integer> l1=new ArrayList<Integer>();
  ArrayList<Integer> l2=new ArrayList<Integer>();
  l1.addAll(al);        
   System.out.println(l1); 
   Collections.sort(l1);        //sort a arrayList in descending order.
   System.out.println(l1);
   int x=l1.size();
   for(int i=x-1;i>=0;i--)
   {
       l2.add(l1.get(i));
   }
  System.out.print(l2);
 }  
}  