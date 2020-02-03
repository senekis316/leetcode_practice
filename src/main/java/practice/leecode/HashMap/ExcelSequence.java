package practice.leecode.HashMap;

public class ExcelSequence {

    public int titleToNumber(String s) {

        char[] chars = s.toCharArray();

        int titleToNumber = 0;

        for (int i = chars.length - 1, j = 0; i >= 0; i--,j++) {
            titleToNumber += (chars[i] - 64) * Math.pow(26, j);
        }

        return titleToNumber;

    }

}
