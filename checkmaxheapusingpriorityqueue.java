 public class xyz{
 static boolean isHeap(int arr[], int n) {  
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[2 * i + 1] > arr[i]) { 
                return false; 
            }
            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) { 
                return false; 
            } 
        } 
        return true; 
    }
    public static void main(String[] args) { 
        int arr[] = {70, 16, 11, 7, 12, 2, 7, 3}; 
        int n = arr.length; 
        if (isHeap(arr, n)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
} 