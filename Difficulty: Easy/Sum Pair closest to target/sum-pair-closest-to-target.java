//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer>res=new ArrayList<>();
        int start=0;
        int end=n-1;
        int mindif=Integer.MAX_VALUE;
        while(start<end){
            int curr=arr[start]+arr[end];
            if(Math.abs(target-curr)<mindif){
                mindif=Math.abs(target-curr);
                res=Arrays.asList(arr[start],arr[end]);
            }
            if(curr<target){
                start++;
            }
            else if(curr>target){
                end--;
            }
            else{
                return res;
            }
        }
        return res;
    }
}