package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiaoGenerate_119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int widthIndex = rowIndex % 2 == 0 ? rowIndex / 2 : rowIndex / 2 + 1;
        long pre = 1;
        for (int i = 1; i <= widthIndex; i++) {
            pre = pre * (rowIndex - i + 1) / i;
            row.add((int)pre);
        }
        int between = rowIndex % 2 == 0 ? 1 : 2;
        for (int i = widthIndex - between; i >= 0; i--) {
            row.add(row.get(i));
        }
        return row;
    }

}
