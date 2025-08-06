public class isPrime {
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int n){
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrimes(100000);
    }
}
