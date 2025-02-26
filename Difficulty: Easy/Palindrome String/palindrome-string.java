//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isPalindrome(String s) {
        // code here
        int flage=0;
        int len=s.length();
        if(len==1){
            return true;
        }else{
            char[]a=s.toCharArray();
            int end=a.length-1;
            int start=0;
            while(start<end){
                if(a[start]!=a[end]){
                    flage=1;
                }
                start++;
                end--;
            }
            }
            if(flage==0){
                return true;
            }
            return false;
        }
    }