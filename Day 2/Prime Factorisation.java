import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div = 2;
        while (n != 1) {
            if (n % div == 0) {
                System.out.print(div + " ");
                n /= div;
            } else if (div * div > n) {
                break;
            } else {
                div++;
            }
        }
        if (n != 1)
            System.out.print(n);
        scn.close();
    }
}