//{ Driver Code Starts
// Initial Java Template

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution oj = new Solution();
            oj.swap(a, b);

            System.out.println("~");
        }
    }
}

// } Driver 


// User function Template for Java

class Solution {
    public void swap(int a, int b) {
        // code here

        System.out.println(b + " " + a);
    }
}
