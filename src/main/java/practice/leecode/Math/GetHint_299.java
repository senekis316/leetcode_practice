package practice.leecode.Math;

public class GetHint_299 {

    public String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        int[] count = new int[10];
        char[] secrets = secret.toCharArray();
        char[] guesses = guess.toCharArray();
        for (int i = 0; i < secrets.length; i++) {
            if (secrets[i] == guesses[i]) {
                A++;
            } else {
                count[secrets[i] - '0']++;
            }
        }
        for (int i = 0; i < guesses.length; i++) {
            if (secrets[i] != guesses[i] && count[guesses[i] - '0'] > 0) {
                B++;
                count[guesses[i] - '0']--;
            }
        }
        return A + "A" + B + "B";
    }

}
