package Structural.Adapter;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ScoreOperation so;
        so = (ScoreOperation) XMLUtil.getBean();
        int[] scores = {84,76,50,69,90,91,88,96};
        int results[];
        int score;

        results = so.sort(scores);
        if(so.search(scores, 90) == 1) {
            System.out.println("Score 90 found!");
        }
        System.out.println(Arrays.toString(results));
    }
}