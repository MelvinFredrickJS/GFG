//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        int lo=Arrays.stream(arr).max().getAsInt();
        int hi=Arrays.stream(arr).sum();
        int res=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(check(arr,k,mid)){
                res=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
        // code here
    }
    static boolean check(int[] arr, int k, int pagelimit){
        int count=1;
        int pagesum=0;
        for(int i=0;i<arr.length;i++){
            if(pagesum+arr[i]>pagelimit){
                count++;
                pagesum=arr[i];
            }else{
                pagesum+=arr[i];
            }
        }
        return (count<=k);
    }
}