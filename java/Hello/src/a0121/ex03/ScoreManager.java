package a0121.ex03;

import java.util.ArrayList;

public class ScoreManager {

    public static void addScore(ArrayList<Integer> list, int score) {
        list.add(score);
    }

    public static double getAverage(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Integer l : list) {
            sum += l;
        }
        return (double) sum / list.size();
    }

    public static int countPass(ArrayList<Integer> list, int passScore) {
        int pass = 0;

        for (Integer l : list) {
            if (l >= passScore) {
                pass++;
            }
        }
        return pass;
    }

    public static int getMaxScore(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int max = 0;
        for (Integer l : list) {
            if (l > max) {
                max = l;
            }
        }
        return max;
    }

}
