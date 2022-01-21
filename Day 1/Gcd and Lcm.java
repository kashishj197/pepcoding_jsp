import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int aa = scn.nextInt();
        int bb = scn.nextInt();
        int a = aa;
        int b = bb;
        while (b > 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
        System.out.println((aa * bb) / a);
    }
}