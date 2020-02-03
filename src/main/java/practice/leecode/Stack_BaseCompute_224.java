package practice.leecode;

import java.util.Stack;

public class Stack_BaseCompute_224 {

    Stack<Integer> intStack = new Stack<>();

    Stack<Character> charStack = new Stack<>();

    public int calculate(String str) {

        str = str.replace(" ", "");

        char[] chars = str.toCharArray();

        boolean pureNumber = true;

        for (int i = 0; i < chars.length; i++) {

            String number = "";

            while(i < chars.length && isNumber(chars[i])) {
                number = number + chars[i];
                i++;
            }

            if (number.length() > 0) {
                intStack.push(Integer.valueOf(number));
                if (!charStack.isEmpty()) {
                    handlerAddAndSub();
                }
                i--;
            } else {
                pureNumber = false;
                charStack.push(chars[i]);
                if (chars[i] == ')') {
                    charStack.pop();
                    charStack.pop();
                    while(!charStack.isEmpty() && charStack.peek()!='(') {
                        handlerAddAndSub();
                    }
                }
            }
        }

        return pureNumber ? Integer.valueOf(str) : intStack.peek();

    }

    private void handlerAddAndSub() {
        switch (charStack.peek()) {
            case '+':
                intStack.push(intStack.pop() + intStack.pop());
                charStack.pop();
                break;
            case '-':
                intStack.push((-intStack.pop()) + intStack.pop());
                charStack.pop();
                break;
        }
    }

    private boolean isNumber(char c) {
        return ((c - 48) >= 0 && (c - 48) <= 57) ? true : false;
    }

}
