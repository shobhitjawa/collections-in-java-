import java.util.*; 
import java.util.stream.*; 
  
public class GFG { 
                                                                                        //  function to convert an Array to List 
    public static void  convertArrayToList(String array[]) 
    { 
        List<String> list = Arrays.asList(array);
        System.out.print("List"+list);
        return; 
    } 
  
    public static void main(String args[]) 
    {
        String array[] = { "hello", "for", 
                                    "A computer " }; 
      System.out.println("Array: " 
                           + Arrays.toString(array)); 
        convertArrayToList(array); 
        //System.out.println("List: " + list); 
    } 
} 