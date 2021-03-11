package practice.leecode.Tree;


public class Calculate_227 {

    public int calculate(String s) {
        int num = 0;
        int top = -1;
        char sign = '+';
        int[] stack = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0') {
                num = num * 10 - '0' + ch;
            }
            if ( i == s.length() - 1 || (ch < '0' && ch != ' ')) {
                switch (sign) {
                    case '+':
                        stack[++top] = num;
                        break;
                    case '-':
                        stack[++top] = -num;
                        break;
                    case '*':
                        stack[top] = stack[top] * num;
                        break;
                    case '/':
                        stack[top] = stack[top] / num;
                        break;
                }
                num = 0;
                sign = ch;
            }
        }
        int ans = 0;
        while (top != -1) {
            ans += stack[top--];
        }
        return ans;
    }

}
