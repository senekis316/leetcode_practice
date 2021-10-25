package practice.leecode.Dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingOffers_638 {

    private List<Integer> prices;
    private List<List<Integer>> specials;
    private Map<List<Integer>, Integer> memo;

    public int shoppingOffers(List<Integer> prices, List<List<Integer>> specials, List<Integer> needs) {
        this.prices = prices;
        this.specials = specials;
        this.memo = new HashMap<>();
        return shoppingOffers(needs);
    }

    private int shoppingOffers(List<Integer> needs) {
        // 缓存中是否已经包含结果
        if (!memo.containsKey(needs)) {

            int min = 0;

            // 购买原价商品计算总价
            for (int i = 0; i < needs.size(); i++) {
                min += needs.get(i) * prices.get(i);
            }

            // 遍历所有special, 统计剩余的need信息
            for (List<Integer> special : specials) {
                List<Integer> surplus = new ArrayList<>();
                for (int i = 0; i < needs.size(); i++) {
                    if (needs.get(i) < special.get(i)) {
                        break;
                    }
                    surplus.add(needs.get(i) - special.get(i));
                }
                if (surplus.size() == prices.size()) {
                    min = Math.min(min, shoppingOffers(surplus) + special.get(special.size() - 1));
                }
            }

            // 设置缓存
            memo.put(needs, min);
        }
        return memo.get(needs);
    }


}
