package practice.leecode.Sort;

public class ArrangeWords_1451 {

    public String arrangeWords(String text) {
        String[] wordTexts = text.split(" ");
        Word[] words = new Word[wordTexts.length];
        for (int i = 0; i < wordTexts.length; i++) {
            words[i] = new Word(i, wordTexts[i]);
        }
        quick_sort(0, words.length - 1, words);
        StringBuilder sb = new StringBuilder();
        sb.append(words[0].getWordText().substring(0, 1).toUpperCase() + words[0].getWordText().substring(1));
        for (int i = 1; i < words.length; i++) {
            sb.append(" " + words[i].getWordText().toLowerCase());
        }
        return sb.toString();
    }

    private void quick_sort(int l, int r, Word[] words) {
        if (l < r) {
            int i = l, j = r;
            Word m = words[l];
            while (i < j) {
                while (i < j && compare(m, words[j]) >= 0) {
                    j--;
                }
                if (i < j) {
                    words[i++] = words[j];
                }
                while (i < j && compare(m, words[i]) < 0) {
                    i++;
                }
                if (i < j) {
                    words[j--] = words[i];
                }
            }
            words[i] = m;
            quick_sort(l, i - 1, words);
            quick_sort(i + 1, r, words);
        }
    }

    private int compare(Word w1, Word w2) {
        if (w1.getLength() < w2.getLength()) {
            return 1;
        } else if (w1.getLength() == w2.getLength()) {
            if (w1.getIndex() < w2.getIndex()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public static class Word {

        private int index;
        private int length;
        private String wordText;

        public Word(int index, String wordText) {
            this.index = index;
            this.length = wordText.length();
            this.wordText = wordText;
        }

        public int getIndex() {
            return index;
        }

        public int getLength() {
            return length;
        }

        public String getWordText() {
            return wordText;
        }

    }

}
