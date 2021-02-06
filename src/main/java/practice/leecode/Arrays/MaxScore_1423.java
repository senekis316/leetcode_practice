package practice.leecode.Arrays;

public class MaxScore_1423 {

    public int maxScore(int[] cardPoints, int k) {
        int w = cardPoints.length - k;
        int ws = 0;
        for (int i = 0; i < w; i++) {
            ws += cardPoints[i];
        }
        int as = ws;
        int min = ws;
        for (int i = w; i < cardPoints.length; i++) {
            ws -= cardPoints[i - w];
            ws += cardPoints[i];
            as += cardPoints[i];
            min = Math.min(ws, min);
        }
        return as - min;
    }

}
