package practice.leecode.String;

public class FirstUniqueChar_387 {

    public int firstUniqueChar(String s) {
        int index = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int prev = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (prev == last && prev != -1) {
                index = Math.min(index, prev);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }



//    public int firstUniqueChar(String s) {
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int prev = s.indexOf(chars[i]);
//            int last = s.lastIndexOf(chars[i]);
//            if (prev == last) {
//                return i;
//            }
//        }
//        return -1;
//    }



    /*public int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (Character character: chars) {
           map.put(character, map.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }*/
}
