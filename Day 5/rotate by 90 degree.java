import java.io.*;
import java.util.*;

public class Main {

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = n - 1;
            while (s < e) {
                int temp = ar[i][s];
                ar[i][s] = ar[i][e];
                ar[i][e] = temp;
                s++;
                e--;
            }
        }

        display(ar);
    }

}