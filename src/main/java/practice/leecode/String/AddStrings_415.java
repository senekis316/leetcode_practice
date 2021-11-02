package practice.leecode.String;

public class AddStrings_415 {

    public String addStrings(String num1, String num2) {
        int jw = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length() - 1, j = num2.length() - 1; i >=0  || j >= 0; i--, j--) {
            int val = jw;
            if (i >= 0) {
                val += num1.charAt(i) - 48;
            }
            if (j >= 0) {
                val += num2.charAt(j) - 48;
            }
            jw = val >= 10 ? 1 : 0;
            sb.append(val % 10);
        }
        if (jw == 1) {
            sb.append(jw);
        }
        return sb.reverse().toString();
    }

}
