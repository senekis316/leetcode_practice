package practice.leecode.String;

public class CheckInclusion_567 {

    public boolean checkInclusion(String s1, String s2) {
        int[] expects = new int[26];
        for (char ch : s1.toCharArray()) {
            expects[ch - 'a']++;
        }
        int cnt = 0;
        int prev = 0;
        int[] actuals = new int[26];
        for (int curr = 0; curr < s2.length(); curr++) {
            int idx = s2.charAt(curr) - 'a';
            if (expects[idx] == 0) {
               prev = curr + 1;
               actuals = new int[26];
               cnt = 0;
            } else {
                if (actuals[idx] == expects[idx]) {
                    while (actuals[idx] == expects[idx]) {
                        if (actuals[s2.charAt(prev) - 'a'] > 0) {
                            actuals[s2.charAt(prev) - 'a']--;
                            prev++;
                            cnt--;
                        }
                    }
                }
                cnt++;
                actuals[idx]++;
            }
            if (cnt == s1.length()) {
                return true;
            }
        }
        return false;
    }

}
