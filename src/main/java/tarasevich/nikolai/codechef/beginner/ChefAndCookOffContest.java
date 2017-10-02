package tarasevich.nikolai.codechef.beginner;

import java.util.*;

/**
 * @author nikolai.tarasevich
 */
public class ChefAndCookOffContest {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<String> results;
        while (true) {
            Integer numberOfTests = Integer.parseInt(scanner.nextLine());
            Map<String, Boolean> contest;
            results = new ArrayList<>(numberOfTests);

            for (int i = 0; i < numberOfTests; i++) {
                contest = defaultContest();
                Integer numberOfEntries = Integer.parseInt(scanner.nextLine());
                for (int j = 0; j < numberOfEntries; j++) {
                    String input = scanner.nextLine();
                    switch (input) {
                        case "cakewalk":
                        case "simple":
                        case "easy": {
                            contest.put(input, true);
                            break;
                        }
                        case "easy-medium":
                        case "medium": {
                            contest.put("medium", true);
                            break;
                        }
                        case "medium-hard":
                        case "hard": {
                            contest.put("hard", true);
                            break;
                        }
                    }
                }
                if (contest.values().contains(false)) {
                    results.add("No");
                } else {
                    results.add("Yes");
                }
            }
            break;
        }

        printResults(results);

    }

    private static Map<String, Boolean> defaultContest() {
        return new HashMap<String, Boolean>() {{
            put("cakewalk", false);
            put("simple", false);
            put("easy", false);
            put("medium", false);
            put("hard", false);
        }};
    }

    private static void printResults(List<String> results) {
        for (String result : results) {
            System.out.println(result);
        }
    }
}
