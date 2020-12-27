package practice.leecode.String;

import java.util.TreeSet;

public class ReorganizeString_767 {

    public String reorganizeString(String S) {
        int length = S.length();
        int[] counts = new int[26];
        CharCountTreeSet charCountTreeSet = new CharCountTreeSet();
        for (char ch : S.toCharArray()) {
            counts[ch - 97]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                charCountTreeSet.add(new CharCount((char)(i + 97), counts[i]));
            }
        }
        StringBuilder sb = new StringBuilder();
        char prevChar = (char)96;
        while (length > 0) {
            boolean modify = false;
            for (CharCount charCount : charCountTreeSet) {
                if (prevChar != charCount.getCh()) {
                    prevChar = charCount.getCh();
                    sb.append(prevChar);
                    charCountTreeSet.remove(charCount);
                    if (charCount.getCount() > 1) {
                        charCount.setCount(charCount.getCount() - 1);
                        charCountTreeSet.add(charCount);
                    }
                    length--;
                    modify = true;
                    break;
                }
            }
            if (!modify) {
                return "";
            }
        }
        return sb.toString();
    }

    private class CharCount {
        private char ch;
        private int count;

        public CharCount(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }

        public char getCh() {
            return ch;
        }

        public void setCh(char ch) {
            this.ch = ch;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

    }

    private class CharCountTreeSet extends TreeSet<CharCount> {
        public CharCountTreeSet() {
            super((o1, o2) -> {
                if (o1.count == o2.count) {
                    return o1.ch - o2.ch;
                }
                return o2.count - o1.count;
            });
        }
    }

}
