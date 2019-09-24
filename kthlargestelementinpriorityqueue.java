import java.util.PriorityQueue;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(Solution.kthLargest(arr, k));
	}

}

public class Solution{
    public static int kthLargest(int arr[] ,int k)
    {
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
        return pq.peek();
}
}