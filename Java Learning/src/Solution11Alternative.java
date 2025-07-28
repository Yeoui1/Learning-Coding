import java.io.*;

class Prime {
    // Method to check if a number is prime
    boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Other even numbers are not prime
        }
        // Check for divisibility by odd numbers up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    // Method to check and print prime numbers from a variable argument list
    void checkPrime(int... numbers) {
        StringBuilder result = new StringBuilder();
        for (int num : numbers) {
            if (isPrime(num)) {
                result.append(num).append(" ");
            }
        }
        System.out.println(result.toString().trim()); // Print prime numbers, trimmed
    }
}

public class Solution11Alternative {
    public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
    }
}