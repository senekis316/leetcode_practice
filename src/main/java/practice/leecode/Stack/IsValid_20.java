package practice.leecode.Stack;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class IsValid_20 {

    private static Map<Character, Character> pairs;

    static {
        pairs = new HashMap<>();
        pairs.put('}', '{');
        pairs.put(']', '[');
        pairs.put(')', '(');
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (pairs.get(ch) == null) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || stack.pop() != pairs.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
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
