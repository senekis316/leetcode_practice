package practice.leecode.Math;

public class DistributeCandies_1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] distributes = new int[num_people];
        for (int i = 1; candies > 0; i++) {
            if (candies >= i) {
                distributes[(i - 1) % num_people] += i;
                candies -= i;
            } else {
                distributes[(i - 1) % num_people] += candies;
                candies = 0;
            }
        }
        return distributes;
    }

}
