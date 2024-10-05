package Labs.Lab_1;

public class Primes {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++){
            if (isPrime(a)){
                System.out.println(a);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int b = 2; b < n; b++) {
            if (n % b == 0){
                return false;
            }
        }
        return true;
    }
}