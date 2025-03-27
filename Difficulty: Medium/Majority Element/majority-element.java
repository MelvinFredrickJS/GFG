//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    static int majorityElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        int cnt = 1;
        Arrays.sort(arr); 

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt++;
            } else {
                if (cnt > n / 2) {
                    return arr[i - 1];
                }
                cnt = 1;
            }
        }

        // Check the last element
        if (cnt > n / 2) {
            return arr[n - 1];
        }

        // if no majority element, return -1
        return -1;
    }
}