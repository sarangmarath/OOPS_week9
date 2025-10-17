interface Discount {
    double apply(double amount);
}

class Payment {
    void processTransaction(double amount) {
        // Local inner class
        class Validator {
            boolean validate(double amt) {
                return amt > 0;
            }
        }

        Validator validator = new Validator();
        if (!validator.validate(amount)) {
            System.out.println("Invalid payment amount.");
            return;
        }

        // Anonymous inner class
        Discount discount = new Discount() {
            @Override
            public double apply(double amt) {
                return amt * 0.9; // 10% discount
            }
        };

        double finalAmount = discount.apply(amount);
        System.out.println("Original: " + amount + ", After discount: " + finalAmount);
    }
}

public class MainTopic6 {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processTransaction(1000);
    }
}
