import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int isPrimeNum = scn.nextInt();
            boolean isPrime = true;
            // for (int divider = 2; divider < isPrimeNum; divider ++) {
            // for (int divider = 2; divider <= isPrimeNum / 2; divider ++) {
            for (int divider = 2; divider * divider <= isPrimeNum; divider ++) {
                if (isPrimeNum % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "prime" : "not prime");
        }
        scn.close();
    }
}