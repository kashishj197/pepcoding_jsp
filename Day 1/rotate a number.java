import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        while (temp != 0) {
            nod++;
            temp /= 10;
        }

        k %= nod;
        if (k < 0)
            k += nod;
        int div = 1;
        int mult = 1;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }

        int qut = n / div;
        int rem = n % div;
        int ans = rem * mult + qut;
        System.out.println(ans);
        scn.close();
    }
}