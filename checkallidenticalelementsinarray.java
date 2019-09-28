import java.util.*;  
public class TestJavaCollection7{  
 public static void main(String args[]) 
    { 
        HashSet<Integer> h1=new HashSet<>();
        int  arr[] = { 2, 2, 2, 2, 2, 2 }; 
        for(Integer x:arr)                                             //check all elemts are identical in array.
        {
            h1.add(x);
        }
        if(h1.size()==1)
        {
            System.out.print("its identical array");
        }
        else
        {
            System.out.println("its non identical array");
        }
        
    } 
}