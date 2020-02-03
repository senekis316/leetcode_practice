package practice.leecode;

public class CanConstruct_383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int temp[] = new int[26];
        for(char c: magazine.toCharArray()) {
            temp[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()) {
            if (temp[c-'a']==0) {
                return false;
            } else {
                temp[c-'a']--;
            }
        }
        return true;

    }

    /*public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() == 0) {
            return true;
        }
        char[] randsomArray = ransomNote.toCharArray();
        for (char randsomChar : randsomArray) {
            String temp = magazine.replaceFirst(String.valueOf(randsomChar), "");
            if (temp.equals(magazine)) {
                return false;
            } else {
                magazine = temp;
            }
        }

        return true;
    }*/

}
