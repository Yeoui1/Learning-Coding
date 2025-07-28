import java.io.*;

class Primers {
    // Prove prime numbers
    boolean isPrime(int n) {
        // If less than 2
        if (n < 2) return false;
        // If number 2
        if (n == 2) return true;
        // If even number
        if (n % 2 == 0) return false;
        // Check divisibility
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        // If not divisible
        return true;
    }
    
    void checkPrime(int... numbers) {
        StringBuilder result = new StringBuilder();
        for (int num : numbers) {
            if (isPrime(num)) {
                result.append(num).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}

public class Solution11 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());

        Primers ob = new Primers();
        ob.checkPrime(n1);
        ob.checkPrime(n1, n2);
        ob.checkPrime(n1, n2, n3);
        ob.checkPrime(n1, n2, n3, n4, n5);
        }
    }