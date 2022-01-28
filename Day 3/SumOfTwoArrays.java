import java.io.*;
import java.util.*;

public class SumOfTwoArrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] ar2 = new int[m];
        for (int i = 0; i < m; i++) {
            ar2[i] = scn.nextInt();
        }
        int[] ar3 = n >= m ? sumArray(ar1, ar2, n - m) : sumArray(ar2, ar1, m - n);
        for (int sN : ar3) {
            System.out.println(sN);
        }
        scn.close();
    }

    public static int[] sumArray(int[] bA, int[] sA, int diff) {
        for (int i = bA.length - 1; i >= diff; i--) {
            bA[i] += sA[i - diff];
        }

        return bA;
    }

}