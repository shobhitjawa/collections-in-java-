import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;

public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
	PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
        PriorityQueue<Integer> heap2=new PriorityQueue<Integer>();
     int x=input.size();
        for(int i=0;i<x;i++)
        {
            for(int k=0;k<input.get(i).size();k++)
            {
                heap2.add(input.get(i).get(k));
           }
            }
        ArrayList<Integer> a1=new ArrayList<Integer>();
                          a1.addAll(heap2);
        Collections.sort(a1); 
        return a1;
}
}

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(k > 0) {
			int n = s.nextInt();
			ArrayList<Integer> current = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				current.add(s.nextInt());
			}
			input.add(current);
			k--;
		}
		ArrayList<Integer> output = Solution.mergeKSortedArrays(input);
		for(int i : output) {
			System.out.print(i + " ");
		}
	}
}