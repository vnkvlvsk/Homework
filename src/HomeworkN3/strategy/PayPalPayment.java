package HomeworkN3.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " руб.");
    }
}
