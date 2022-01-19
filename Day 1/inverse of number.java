import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pos = 1;
        int res = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            res += pos * (int) Math.pow(10, digit - 1);
            pos++;
        }
        System.out.println(res);
        scn.close();
    }
}