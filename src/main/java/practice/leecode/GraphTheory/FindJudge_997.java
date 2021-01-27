package practice.leecode.GraphTheory;

public class FindJudge_997 {

    public int findJudge(int N, int[][] trust) {
        int[] cnt = new int[N + 1];
        for (int[] part : trust) {
            cnt[part[0]]--;
            cnt[part[1]]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == N - 1) return i;
        }
        return -1;
    }

}
