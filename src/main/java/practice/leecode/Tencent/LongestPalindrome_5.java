package practice.leecode.Tencent;


public class LongestPalindrome_5 {

    private String preHandleString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            sb.append('#');
        }
        return sb.toString();
    }

    public String longestPalindrome(String s) {
        String str = preHandleString(s);
        int len = str.length();
        int center = 0, longestHalf = 0, rightSide = 0, rightCenter = 0;
        int[] halfArray = new int[len];
        for (int i = 0; i < len; i++) {
            boolean needExtend = true;
            if (rightSide > i) {
                int leftCenter = 2 * rightCenter - i;
                halfArray[i] = halfArray[leftCenter];
                if (i + halfArray[i] > rightSide) {
                    halfArray[i] = rightSide - i;
                }
                if (i + halfArray[i] < rightSide) {
                    needExtend = false;
                }
            }
            if (needExtend) {
                while (i - 1 - halfArray[i] >= 0 && i + 1 + halfArray[i] < len) {
                    if (str.charAt(i - 1 - halfArray[i]) == str.charAt(i + 1 + halfArray[i])) {
                        halfArray[i]++;
                    } else {
                        break;
                    }
                }
                rightSide = i + halfArray[i];
                rightCenter = i;
                if (halfArray[i] > longestHalf) {
                    center = i;
                    longestHalf = halfArray[i];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = center - longestHalf + 1; i <= center + longestHalf; i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }



//    // 预处理字符串，在两个字符之间加上#
//    private String preHandleString(String s) {
//        StringBuffer sb = new StringBuffer();
//        int len = s.length();
//        sb.append('#');
//        for (int i = 0; i < len; i++) {
//            sb.append(s.charAt(i));
//            sb.append('#');
//        }
//        return sb.toString();
//    }
//
//    // 寻找最长回文字符串
//    public String longestPalindrome(String s) {
//        // 先预处理字符串
//        String str = preHandleString(s);
//        // 处理后的字符串长度
//        int len = str.length();
//        // 右边界
//        int rightSide = 0;
//        // 右边界对应的回文串中心
//        int rightSideCenter = 0;
//        // 保存以每个字符串为中心的回文长度的一半(向下取整)
//        int[] halfLenArr = new int[len];
//        // 记录回文中心
//        int center = 0;
//        // 记录最长回文长度
//        int longestHalf = 0;
//        for (int i = 0; i < len; i++) {
//            // 是否需要中心扩展
//            boolean needCalc = true;
//            // 如果在右边界的覆盖之内
//            if (rightSide > i) {
//                // 计算相对rightSideCenter的对称位置
//                int leftCenter = 2 * rightSideCenter - i;
//                // 根据回文性质得到的结论
//                halfLenArr[i] = halfLenArr[leftCenter];
//                // 如果超过了右边界，进行调整
//                if (i + halfLenArr[i] > rightSide) {
//                    halfLenArr[i] = rightSide - i;
//                }
//                // 如果根据已知条件计算得出的最长回文小于右边界，则不需要扩展了
//                if (i + halfLenArr[leftCenter] < rightSide) {
//                    // 直接推出结论
//                    needCalc = false;
//                }
//            }
//            // 中心扩展
//            if (needCalc) {
//                while (i - 1 - halfLenArr[i] >= 0 && i + 1 + halfLenArr[i] < len) {
//                    if (str.charAt(i - 1 - halfLenArr[i]) == str.charAt(i + 1 + halfLenArr[i])) {
//                        halfLenArr[i]++;
//                    } else {
//                        break;
//                    }
//                }
//                // 更新右边界及中心
//                rightSide = i + halfLenArr[i];
//                rightSideCenter = i;
//                // 记录最长回文串
//                if (halfLenArr[i] > longestHalf) {
//                    center = i;
//                    longestHalf = halfLenArr[i];
//                }
//            }
//        }
//        // 去掉之前添加的#
//        StringBuffer sb = new StringBuffer();
//        for (int i = center - longestHalf + 1; i <= center + longestHalf; i += 2) {
//            sb.append(str.charAt(i));
//        }
//        return sb.toString();
//    }


//    public String longestPalindrome(String s) {
//
//        if (s==null || s.length()==0) return s;
//
//        String[] strs = getHandleStrings(s);
//
//        int[] pos = new int[strs.length];
//
//        int center = 0, right = 0;
//
//        for (int i=1; i<strs.length-1; i++) {
//
//            //1.确定最小P[i]
//            if (right > i) {
//                int mirror = pos[center - (i - center)];
//                int expand = right - i;
//                pos[i] = Math.min(mirror, expand);
//                //
//            } else {
//                pos[i] = 0;
//            }
//
//            //2.增长P[i]到最大
//            while((i - 1 - pos[i]) > -1  && i + 1 + pos[i] < strs.length && strs[i - 1 - pos[i]].equals(strs[i + 1 + pos[i]])) {
//                pos[i]++;
//            }
//
//            //3.更新cr
//            if (right < i + pos[i]) {
//                right = i + pos[i];
//                center = i;
//            }
//
//        }
//
//        return getLongestPalindrome(strs, pos);
//    }
//
//    private String[] getHandleStrings(String s) {
//
//        String[] strs = s.split("");
//
//        StringBuilder sb = new StringBuilder('#');
//        for (int i = 0; i < strs.length; i++) {
//            sb.append('#' + strs[i]);
//        }
//
//        sb.append('#');
//
//        return sb.toString().split("");
//
//    }
//
//    private String getLongestPalindrome(String[] strs , int[] pos) {
//
//        int max = 0;
//        int max_index = 0;
//
//        for (int i=0; i<pos.length; i++) {
//            if (pos[i] > max) {
//                max = pos[i];
//                max_index = i;
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        int radius = max;
//        int begin = max_index - radius;
//        int end = max_index + radius;
//
//        for (int i = begin; i <= end; i++) {
//            sb.append(strs[i]);
//        }
//
//        return sb.toString().replace("#","");
//
//    }



}
