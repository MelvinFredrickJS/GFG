//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
// Java program to calculate missing ranges in an array

    public static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        // Check for missing range before the first element
        if (lower < arr[0]) {
            res.add(Arrays.asList(lower, arr[0] - 1));
        }

        // Check for missing ranges between consecutive elements
        for (int i = 0; i < n - 1; ++i) {
            if (arr[i + 1] - arr[i] > 1) {
                res.add(Arrays.asList(arr[i] + 1, arr[i + 1] - 1));
            }
        }

        // Check for missing range after the last element
        if (upper > arr[n - 1]) {
            res.add(Arrays.asList(arr[n - 1] + 1, upper));
        }

        return res;
    }

}



//{ Driver Code Starts.

public class GfG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Solution solution = new Solution();

            // Read lower bound
            int lower = Integer.parseInt(br.readLine());

            // Read upper bound
            int upper = Integer.parseInt(br.readLine());

            // Read the array elements
            String[] elements = br.readLine().split("\\s+");
            int[] arr = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            // Get the missing ranges
            List<List<Integer>> missingRanges =
                solution.missingRanges(arr, lower, upper);

            // Print the result
            if (missingRanges.isEmpty()) {
                System.out.println("[]");
            } else {
                for (List<Integer> range : missingRanges) {
                    System.out.println(range.get(0) + " " + range.get(1));
                }
            }

            // Separator for test cases
            System.out.println("~");
        }
    }
}
// } Driver Code Ends