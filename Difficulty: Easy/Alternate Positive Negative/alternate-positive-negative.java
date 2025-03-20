//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        int len=arr.size();
        for(int i=0;i<len;i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }else{
                neg.add(arr.get(i));
            }
        }
        int posind=0;
        int negind=0;
        int i=0;
        while(posind<pos.size() && negind<neg.size()){
            if(i%2==0){
                arr.set(i,pos.get(posind));
                posind++;
                i++;
            }else{
                arr.set(i,neg.get(negind));
                negind++;
                i++;
            }
        }
        while(posind<pos.size()){
            arr.set(i,pos.get(posind));
            posind++;
            i++;
        }
        while(negind<neg.size()){
            arr.set(i,neg.get(negind));
            negind++;
            i++;
        }
    }
}