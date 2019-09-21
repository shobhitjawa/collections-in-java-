import java.util.*;  
public class ArrayList3{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Audi");  
  al.add("BMW");  
  al.add("Merc");  
  al.add("Lexus");  
                      //Traversing list through for-each loop  
  for(String obj:al)  
    System.out.println(obj);  
 }  
}  