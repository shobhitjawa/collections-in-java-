import java.util.*; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    {                                     //HashsettoArray.
        HashSet<String> 
            abs_col = new HashSet<String>();
        abs_col.add("Welcome"); 
        abs_col.add("To"); 
        abs_col.add("Geeks"); 
        abs_col.add("For"); 
        abs_col.add("Geeks");
        System.out.println("The HashSet: "
                           + abs_col); 
        Object[] arr = abs_col.toArray(); 
        System.out.println("The array is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
    } 
} 