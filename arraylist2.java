import java.util.*;  
public class ArrayList2{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Audi");  
  list.add("BMW");  
  list.add("Merc");  
  list.add("Lexus");    
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  