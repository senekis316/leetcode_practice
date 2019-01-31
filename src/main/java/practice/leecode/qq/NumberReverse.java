package practice.leecode.qq;


public class NumberReverse {

    public int reverse(int x) {

        if (x > -10 && x < 10){
            return x;
        }

       StringBuilder sb = new StringBuilder();

       int num1 = x < 0 ? x * -1 : x;

       while (true) {

           int num2 = num1 % 10;
           num1 = num1 / 10;

           if (num2 == 0 && num1 == 0) {
               break;
           }

           sb.append(String.valueOf(num2));

       }

       String reverse_str = sb.toString();

       int reverse_num = 0;
       try {
           reverse_num = Integer.valueOf(reverse_str);
       } catch(NumberFormatException e) {}

       return x < 0 ? reverse_num * -1 : reverse_num;
    }
}
