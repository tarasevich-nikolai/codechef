package tarasevich.nikolai.codechef.beginner.factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author nikolai.tarasevich
 */
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> results;
        while (true) {
            Integer numberOfTests = scanner.nextInt();
            results = new ArrayList<>(numberOfTests);

            for (int i = 0; i < numberOfTests; i++) {
                Integer number = scanner.nextInt();
                Integer result = 0;
                for (int j = 5; j < number + 1; j *= 5) {
                    result += number / j;
                }
                results.add(result);
            }

            break;
        }
        printResults(results);
    }

    private static void printResults(List<Integer> results) {
        for (Integer result : results) {
            System.out.println(result);
        }
    }
}
