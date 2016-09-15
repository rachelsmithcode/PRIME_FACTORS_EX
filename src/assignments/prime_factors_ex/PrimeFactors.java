package assignments.prime_factors_ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RachelSmith on 15/09/2016.
 */
public class PrimeFactors {

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
