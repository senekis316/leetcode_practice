package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiaoGenerate_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> yhsj = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i != 0) {
                row.add(1);
                List<Integer> prev = yhsj.get(yhsj.size() - 1);
                for (int j = 0; j < prev.size() - 1; j++) {
                    row.add(prev.get(j) + prev.get(j + 1));
                }
            }
            row.add(1);
            yhsj.add(row);
        }
        return yhsj;
    }

}
