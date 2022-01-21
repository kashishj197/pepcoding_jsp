import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int itr = 0;
        int ans = 0;
        while (n != 0) {
            int rem = n % b;
            n /= b;
            ans += rem * Math.pow(10, itr++);
        }
        System.out.println(ans);
        scn.close();
    }
}