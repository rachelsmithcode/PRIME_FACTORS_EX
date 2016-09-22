package assignments.prime_factors_ex;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactors {

    public static void main (String[] args) {
        new PrimeFactors().runExamples();
    }

    public void runExamples() {
        System.out.println("When given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.\n");
        System.out.println("\nGenerate(1) will return an empty list\n");
        new PrimeFactors().generate(1);
        System.out.println("\nGenerate(30) will return the numbers: 2,3,5\n");
        new PrimeFactors().generate(30);
    }

    public void generate(int n) {

        printList(findPrimeFactors(n));

    }

    private static List<Integer> findPrimeFactors(int n) {
        int num = n;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        return factors;
    }

    private void printList(List<Integer> factors) {
        System.out.println(factors);
    }
}
