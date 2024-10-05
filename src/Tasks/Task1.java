package Tasks;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));

    }

    public static double convert(int n) {
        return n * 3.785;
    }

    public static int fitCalc(int x, int y) {
        return x * y;
    }

    public static int containers(int x, int y, int z) {
        return x * 20 + y * 50 + z * 100;
    }

    public static String triangleType(int x, int y, int z) {
        if (x > y + z || y > x + z || z > x + y) {
            return "not a triangle";
        } else if (x == y && x == z && y == z) {
            return "isosceles";
        } else if (x == y || x == z || y == z) {
            return "equilateral";
        } else {
            return "different-sided";
        }
    }

    public static int ternaryEvaluation(int x, int y) {
        return x > y ? x : y;
    }

    public static int howManyItems(int x, double y, double z) {
        return (int) (x / 2 / y / z);
    }

    public static int factorial(int x) {
        int count = 1;
        for (int i = 1; i <= x; i++) {
            count *= i;
        }
        return count;
    }

    public static int gcd(int x, int y) {
        int minNumber = x < y ? x : y;
        int maxNumber = x > y ? x : y;
        int minDel = 0;
        for (int i = 1; i <= minNumber; i++) {
            if (minNumber % i == 0 && maxNumber % i == 0) {
                minDel = i;
            }
        }
        return minDel;
    }

    public static int ticketSaler(int x, int y) {
        return (int) (x * y * 0.72);
    }

    public static int tables(double  x, double y) {
        double desks = Math.ceil(x / 2);
        double result = 0;
        if (desks > y){
            result = desks - y;
        }
        return (int) (result);
    }
}

