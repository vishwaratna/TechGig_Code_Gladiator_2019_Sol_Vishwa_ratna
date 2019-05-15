package Java8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode {
    public static String battle(int[] strength, int[] energy) {
        int k = 0;
        int l = 0;
        for (int i = 0; i < strength.length; i++) {
            if (strength[i] < energy[i]) {
                k++;
            } else {
                l++;
            }
        }
        if (k == strength.length) {
            return "WIN";
        } else {
            return "LOSE";
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);
        int TestCases = reader.nextInt();
        reader.nextLine();
        String[] output = new String[TestCases];

        for (int i = 0; i < TestCases; i++) {
            int playerandvillan = reader.nextInt();
            reader.nextLine();
            String[] a = reader.nextLine().split(" ");
            String[] b = reader.nextLine().split(" ");
            int[] sum1 = Arrays.stream(a).mapToInt(Integer::parseInt).sorted().toArray();
            int[] sum2 = Arrays.stream(b).mapToInt(Integer::parseInt).sorted().toArray();

            output[i] = battle(sum1, sum2);
        }
        Arrays.stream(output).forEach(System.out::println);
    }

}

