//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
    int n = mat.length, m = mat[0].length;
        int c0 = 1;
        // Traverse the arr and mark first cell of each row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {

                    // mark i-th row
                    mat[i][0] = 0;

                    // mark j-th column
                    if (j == 0)
                        c0 = 0;
                    else
                        mat[0][j] = 0;
                }
            }
        }

        // Traverse and mark the matrix from (1, 1) to (n - 1, m - 1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                // Check for col & row
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Mark the first row
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++)
                mat[0][j] = 0;
        }

        // Mark the first column
        if (c0 == 0) {
            for (int i = 0; i < n; i++)
                mat[i][0] = 0;
        }
    }
        
    }
