//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int start=0;
        int rows=mat.length;
        int col=mat[0].length;
        int end=rows*col-1;
        while(start<=end){
            int mid=(start+end)/2;
            int srow=mid/col;
            int scol=mid%col;
            if(mat[srow][scol]==x){
                return true;
            }else if(mat[srow][scol]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
