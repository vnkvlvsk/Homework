package HomeworkN3.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой: " + amount + " руб.");
    }
}
