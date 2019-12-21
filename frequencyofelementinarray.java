import java.io.*; 
import java.util.*; 
public class OccurenceOfNumberInArray { 
    static void frequencyNumber(int arr[], int size) 
    { 
        // Creating a HashMap containing integer 
        // as a key and occurrences as a value 
        HashMap<Integer, Integer> m1
            = new HashMap<Integer, Integer>(); 
             HashMap<Integer, Integer> m2
            = new HashMap<Integer, Integer>();
                      for(int i=0;i<size;i++)
          {
              m2.put(arr[i],1);
          }
            
            
                       for (Map.Entry entry : m2.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        System.out.println();
                                                                                   //count freq of element in array in java
                                                                                   //time complexity -O(n). space complexity-O(n).
            
          for(int i=0;i<size;i++)
          {
              if(m1.containsKey(arr[i]))
              {
                  m1.put(arr[i],m1.get(arr[i])+1);
              }
              else
              {
                  m1.put(arr[i],1);
              }
          }
           for (Map.Entry entry : m1.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
          
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20}; 
        int size = arr.length; 
        frequencyNumber(arr,size); 
    } 
} 