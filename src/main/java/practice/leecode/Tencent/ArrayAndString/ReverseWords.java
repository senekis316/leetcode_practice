package practice.leecode.Tencent.ArrayAndString;

public class ReverseWords {

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0, z = chars.length - 1; j < z; j++, z--) {
                if (chars[j] != chars[z]) {
                    char tmp = chars[j];
                    chars[j] = chars[z];
                    chars[z] = tmp;
                }
            }
            words[i] = new String(chars);
        }

        return String.join(" ", words);

    }

}
