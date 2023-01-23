public class CreditPaymentService {
    public double calculate(double sum, double percent, double period) {
        double Payment = (sum * (percent / 12 / 100) * (Math.pow((1 + percent / 12 / 100), period))) / (Math.pow((1 + percent / 12 / 100), period) - 1);
        return Payment;
    }
}