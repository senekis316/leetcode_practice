package practice.leecode.Arrays;

import java.util.LinkedList;

public class DeckRevealedIncreasing_950 {

    public int[] deckRevealedIncreasing(int[] deck) {
        quick_sort(deck, 0, deck.length - 1);
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (nums.size() >= 2) {
                nums.addFirst(nums.removeLast());
            }
            nums.addFirst(deck[i]);
        }
        int[] res = new int[deck.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums.pollFirst();
        }
        return res;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int m = nums[l];
            while(i < j) {
                while(i < j && nums[j] >= m) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && nums[i] < m) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

    /*private void quick_sort(int[] nums, int left, int right) {
        if (left < right) {
            int l = left;
            int r = right;
            int m = nums[l];
            while(l < r) {
                while(l < r && nums[l] < m) {
                    l++;
                }
                while(l < r && nums[r] > m) {
                    r--;
                }
                if (l < r) {
                    nums[l] = nums[l] ^ nums[r];
                    nums[r] = nums[l] ^ nums[r];
                    nums[l] = nums[l] ^ nums[r];
                }
            }
            if (l != r) {
                nums[l] = nums[left];
                nums[left] = m;
            }
            quick_sort(nums, left, l - 1);
            quick_sort(nums, l + 1, right);
        }
    }*/

}
