package ProblemSolving;

import java.util.List;

public class ProblemSolving {
    public static int simpleArraySum(List<Integer> ar) {
        int sumOfInt = 0;
        for (int i = 0; i < ar.size(); i++) {
            sumOfInt += ar.get(i);
        }
        return sumOfInt;
    }

}
