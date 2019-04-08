package practice.leecode.Tencent;


public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String curr = "";
        String[] sub = s.split("");
        int middle = s.length() / 2;
        for (int i=0; i<s.length(); i++) {
            if (curr.contains(sub[i])) {
                curr = curr.substring(curr.indexOf(sub[i]) + 1);
            }
            curr = curr + sub[i];
            max = Math.max(max, curr.length());

            if(curr.length() == 1 && i >= middle && max >= s.length()-i) {
                return max;
            }
        }
        return max;
    }

}
