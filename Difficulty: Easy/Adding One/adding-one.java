//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution ob = new Solution();
            Vector<Integer> result = ob.addOne(arr);

            // Print the result vector
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    Vector<Integer> addOne(int[] arr) {
        int n = arr.length;
        
        // Process the carry from right to left
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            
            // If no carry, we can stop early
            if (carry == 0) {
                break;
            }
        }
        
        // Create result vector
        Vector<Integer> result = new Vector<>();
        
        // If there's still a carry, add it to the beginning
        if (carry > 0) {
            result.add(carry);
        }
        
        // Add all digits from the modified array
        for (int digit : arr) {
            result.add(digit);
        }
        
        return result;
    }
}