package practice.leecode.Dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Answers_781 {

    public int numRabbits(int[] answers) {
        int ans = 0;
        int[] count = new int[1000];
        for (int answer : answers) {
            if (count[answer] == 0) {
                ans += answer + 1;
                count[answer] = answer;
            } else {
                count[answer]--;
            }
        }
        return ans;
    }

//    public int numRabbits(int[] answers) {
//        int ans = 0;
//        int[] count = new int[1000];
//        for (int i = 0; i < answers.length; i++) {
//            count[answers[i]]++;
//            if (count[answers[i]] == 1) {
//                ans += answers[i] + 1;
//            } else {
//                if (answers[i] + 1 < count[answers[i]]) {
//                    count[answers[i]] = 1;
//                    ans += answers[i] + 1;
//                }
//            }
//        }
//        return ans;
//    }

//    public int numRabbits(int[] answers) {
//        int ans = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < answers.length; i++) {
//            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
//            if (map.get(answers[i]) == 1) {
//                ans += answers[i] + 1;
//            } else {
//                if (answers[i] + 1 < map.get(answers[i])) {
//                    map.put(answers[i], 1);
//                    ans += answers[i] + 1;
//                }
//            }
//        }
//        return ans;
//    }
}
