//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        int res=0;
        Arrays.sort(arr);
        for(int i=2;i<n;++i){
            int start=0;
            int end=i-1;
            while(start<end){
                int sum=arr[start]+arr[end];
                if(sum>arr[i]){
                    res+=end-start;
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
}