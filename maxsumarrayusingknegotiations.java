import java.util.*; 
  
public class maximizeSum 
{ 
    public static int maxSum(int[] a, int k) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for (int x : a) 
            pq.add(x);
         ///  System.out.println(pq);
        while (k-- > 0) 
        {                                    //maximum array sum after k negotiations.complexity-O(n).
            int temp = pq.poll(); 
          // System.out.println(temp);
            temp *= -1; 
            pq.add(temp); 
        } 
        int sum = 0; 
        for (int x : pq) 
            sum += x; 
        return sum; 
    } 
    public static void main (String[] args) 
    { 
        int[] arr = {-2, 0, 5, -1, 2}; 
        int k = 4; 
        System.out.println(maxSum(arr, k)); 
    } 
} 