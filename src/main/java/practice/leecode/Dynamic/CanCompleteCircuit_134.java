package practice.leecode.Dynamic;

public class CanCompleteCircuit_134 {

    // 方法二:
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0, total = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            curr += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (curr < 0) {
                curr = 0;
                start = i + 1;
            }
        }
        return curr >= 0 && total >= 0 ? start : -1;
    }

    // 方法一:
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        for (int i = 0; i < gas.length; i++) {
//            if (gas[i] >= cost[i]) {
//                int sum = 0;
//                int count = 0;
//                while (count != gas.length && sum >= 0) {
//                    int curr = (i + count) % gas.length;
//                    sum += gas[curr] - cost[curr];
//                    count++;
//                }
//                if (sum >= 0) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }

}
