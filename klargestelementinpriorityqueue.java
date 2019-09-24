import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Solution {

	public static ArrayList<Integer> kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]>pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> ar=new ArrayList<Integer>();
        while(pq.size()!=0)
        {
        ar.add(pq.poll());
        }
        return ar;
}
}
 public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int j = 0; j < n; j++) {
			input[j] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> output = Solution.kLargest(input, k);
		for(int i : output) {
			System.out.println(i);
		}
		
	}
 }


