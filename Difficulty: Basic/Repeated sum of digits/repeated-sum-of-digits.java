//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.repeatedSumOfDigits(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int repeatedSumOfDigits(int N){
        // code here
        int sum=0;
        int n=N;
        while(n>0||sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}
