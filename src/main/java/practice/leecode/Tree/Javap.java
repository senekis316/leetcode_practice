package practice.leecode.Tree;

public class Javap {

    interface Customer {
        boolean isVIP();
    }

    class VIP implements Customer {
        @Override
        public boolean isVIP() {
            return true;
        }
    }

    class Merchant<T extends Customer> {
        public Double actionPrice(double price, T customer) {
            return 0d;
        }
    }

    class NaiveMerchant extends Merchant {
        @Override
        public Double actionPrice(double price, Customer customer) {
            return 0d;
        }
    }

    class VIPOnlyMerchant extends Merchant<VIP> {
        @Override
        public Double actionPrice(double price, VIP customer) {
            return 0d;
        }
    }

}
