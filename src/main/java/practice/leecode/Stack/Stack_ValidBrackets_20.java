package practice.leecode.Stack;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack_ValidBrackets_20 {


    private static Map<Character, Character> bracketPairHashMap = new HashMap<>();

    static {
        bracketPairHashMap.put(')', '(');
        bracketPairHashMap.put(']', '[');
        bracketPairHashMap.put('}', '{');
    }

    public boolean isValid(String str) {

        if (str == null || str.length() == 1) {
            return false;
        }

        if (str.length() == 0) {
            return true;
        }

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (bracketPairHashMap.containsKey(c)) {
                char top = bracketStack.empty() ? '#' : bracketStack.pop();
                if (top != bracketPairHashMap.get(c)) {
                    return false;
                }
            } else {
                bracketStack.push(c);
            }

        }

        return bracketStack.empty();

    }

}


//自定义Stack解决括号匹配问题
/*public class Stack_ValidBrackets_20 {

    public boolean isValid(String str) {

        if (str == null || str.length() == 1) {
            return false;
        }

        char[] brackets = str.toCharArray();

        Stack bracketStack = new Stack(brackets.length);

        for (int i = 0; i < brackets.length; i++) {

            if (isValidLeftChar(brackets[i])) {
                bracketStack.push(brackets[i]);
            } else if (isValidRightChar(brackets[i])) {
                if (bracketStack.count < 1) {
                    return false;
                }
                if (!isValidPairChar(bracketStack.pop(), brackets[i])) {
                    return false;
                }
            } else {
                return false;
            }

        }

        if (bracketStack.count == 0) {
            return true;
        } else {
            return false;
        }

    }

    private class Stack {

        private int count;

        private char[] brackets;

        public Stack(int length) {
            this.brackets = new char[length];
        }

        public void push(char c) {
            brackets[count++] = c;
        }

        public char pop() {
            return brackets[--count];
        }

    }

    private boolean isValidLeftChar(char c) {
        if (c == '(' || c == '[' || c == '{') {
            return true;
        }
        return false;
    }

    private boolean isValidRightChar(char c) {
        if (c == ')' || c == ']' || c == '}') {
            return true;
        }
        return false;
    }

    private boolean isValidPairChar(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }

}*/
