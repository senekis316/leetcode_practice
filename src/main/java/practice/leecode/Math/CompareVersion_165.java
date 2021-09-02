package practice.leecode.Math;

public class CompareVersion_165 {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int[] ver1 = new int[v1.length];
        int[] ver2 = new int[v2.length];
        int len = Math.min(ver1.length, ver2.length);
        for (int i = 0; i < len; i++) {
            int num1 = Integer.valueOf(v1[i]);
            int num2 = Integer.valueOf(v2[i]);
            if (num1 > num2) {
                return 1;
            }
            if (num1 < num2) {
                return -1;
            }
        }
        for (int i = len; i < ver1.length; i++) {
            int num1 = Integer.valueOf(v1[i]);
            if (num1 > 0) {
                return 1;
            }
        }
        for (int i = len; i < ver2.length; i++) {
            int num2 = Integer.valueOf(v2[i]);
            if (num2 > 0) {
                return -1;
            }
        }
        return 0;
    }

}
