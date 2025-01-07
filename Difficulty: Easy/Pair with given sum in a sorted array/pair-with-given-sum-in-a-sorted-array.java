//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        int n=arr.length;
        Arrays.sort(arr);
        int res=0;
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum<target){
                start++;
            }else if(sum>target){
                end--;
            }
            else{
                int ele1=arr[start];
                int ele2=arr[end];
                int fe1=0;
                int fe2=0;
                while(start<=end && arr[start]==ele1){
                    fe1++;
                    start++;
                }
                while(start<=end && arr[end]==ele2){
                    fe2++;
                    end--;
                }
                
                if(ele1==ele2){
                    res+=(fe1*(fe1-1))/2;
                }
                else{
                    res+=fe1*fe2;
                }
                
            }
        }
        return res;
    }
}



//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends