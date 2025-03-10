//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxProduct(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                tmax=smax;
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax){
                tmax=smax;
                smax=arr[i];
            }else if(arr[i]>tmax){
                tmax=arr[i];
            }
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin){
                smin=arr[i];
            }
        }
        return Math.max(min*smin*max,max*smax*tmax);
    }
}
