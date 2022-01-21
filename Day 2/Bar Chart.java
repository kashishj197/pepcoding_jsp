import java.util.*;

class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(arr[i], max);
        }
        while (max != 0) {
            for (int num : arr) {
                if (num >= max) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            max--;
            System.out.println();
        }
        scn.close();
    }
}