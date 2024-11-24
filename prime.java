public class prime {
    public static void main(String[] args) {
        int number = 29; // Example number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // Divisible by other numbers
        }
        return true; // Prime number
    }
}
