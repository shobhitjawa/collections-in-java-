import java.util.*; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    { 
        HashSet<String> 
            h1 = new HashSet<String>();  
        h1.add("Welcome"); 
        h1.add("To"); 
        h1.add("Geeks"); 
        h1.add("For"); 
        h1.add("Geeks"); 
        System.out.println("The HashSet: "
                           + h1);  
        String[] arr = new String[5]; 
        arr = h1.toArray(arr);
        System.out.println("The arr[] is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
    } 
} 