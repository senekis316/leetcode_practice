package practice.dajiang;

public class BuyFoods {

    private Integer max = 0;

    public int mostSatisfyDegree(Budget budget, Food[] foods) {
        mostSatisfyDegree(budget, foods, 0);
        return max;
    }

    private void mostSatisfyDegree(Budget budget, Food[] foods, int degree) {

        if (budget == null || budget.money < 0) {
            return;
        }

        if (foods == null || foods.length == 0) {
            return;
        }

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].amount > 0 && foods[i].price <= budget.money) {
                foods[i].amount--;
                degree += foods[i].satisfy;
                budget.money -= foods[i].price;
                if (degree > max) {
                    max = degree;
                }
                mostSatisfyDegree(budget, foods, degree);
                foods[i].amount++;
                degree -= foods[i].satisfy;
                budget.money += foods[i].price;
            }
        }

    }

    public static class Budget {

        private int kind;

        private int money;

        public Budget(Budget budget) {
            this(budget.getKind(), budget.getMoney());
        }

        public Budget(int kind, int money) {
            this.kind = kind;
            this.money = money;
        }

        public int getKind() {
            return kind;
        }

        public void setKind(int kind) {
            this.kind = kind;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }
    }

    public static class Food {

        private int price;

        private int satisfy;

        private int amount;

        public Food(int price, int satisfy, int amount) {
            this.price = price;
            this.satisfy = satisfy;
            this.amount = amount;
        }

        public Food(Food food) {
            this(food.price, food.satisfy, food.amount);
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSatisfy() {
            return satisfy;
        }

        public void setSatisfy(int satisfy) {
            this.satisfy = satisfy;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }

}
