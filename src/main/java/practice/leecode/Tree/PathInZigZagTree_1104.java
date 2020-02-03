package practice.leecode.Tree;

import java.util.LinkedList;
import java.util.List;

public class PathInZigZagTree_1104 {

    List<Integer> pathList = new LinkedList<>();
    public List<Integer> pathInZigZagTree(int label) {
        int head = 1;
        int row = 1;
        while(head*2<=label){
            head*=2;
            row++;
        }
        fillPathInList(row,head,label);
        return pathList;
    }
    private void fillPathInList(int row,int head,int temp){
        if(row==1){
            pathList.add(1);
            return;
        }
        int index = (temp-head)/2+1;
        int newTemp = head-index;
        fillPathInList(row-1,head/2,newTemp);
        pathList.add(temp);
    }

}
