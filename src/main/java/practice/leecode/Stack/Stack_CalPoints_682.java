package practice.leecode.Stack;

import java.util.Stack;

public class Stack_CalPoints_682 {

    Stack<Integer> pointStack = new Stack<>();

    public int calPoints(String[] ops) {

        int sum = 0;

        for (int i=0; i<ops.length; i++) {
            switch(ops[i]) {
                case "+": {
                    int second = pointStack.pop();
                    int first = pointStack.pop();
                    int score = first + second;
                    pointStack.push(first);
                    pointStack.push(second);
                    pointStack.push(score);
                    sum += score;
                    break;
                }
                case "D": {
                    int score = pointStack.peek() * 2;
                    pointStack.push(score);
                    sum += score;
                    break;
                }
                case "C":
                    sum -= pointStack.pop();
                    break;
                default: {
                    int score = Integer.valueOf(ops[i]);
                    pointStack.push(score);
                    sum += score;
                }
            }
        }

        return sum;

    }



}
