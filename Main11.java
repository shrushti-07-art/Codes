package codes;

interface PaymentMethod {
    void makePayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}

public class Main11 {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment();
        payment1.makePayment(100);

        PaymentMethod payment2 = new PayPalPayment();
        payment2.makePayment(200);
    }
}
