package practice.leecode.String;

public class ConvertToTitle_168 {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n -= 1;
            sb.insert(0, (char)(n % 26 + 'A'));
            n /= 26;
        }
        return sb.toString();
    }

}
