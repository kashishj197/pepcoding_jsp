import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int dest = getValueIndecimal(n, sourceBase);
        int ans = getValueInBase(dest, destBase);
        System.out.println(ans);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int itr = 0;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            ans += rem * Math.pow(b, itr++);
        }

        return ans;
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int ans = 0;
        int itr = 0;
        while (n != 0) {
            int rem = n % b;
            n /= b;
            ans += rem * (int) Math.pow(10, itr++);
        }

        return ans;
    }
}