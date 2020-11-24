package practice.leecode.Math;

public class ConvertToBase7_504 {

    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        while (num / 7 != 0) {
            sb.insert(0, String.valueOf(num % 7).replace("-", ""));
            num /= 7;
        }
        sb.insert(0, num);
        return sb.toString();
    }

}
