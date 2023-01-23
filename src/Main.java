public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;          // Сумма кредита
        double percent = 9.99;           // % ставка (в год)
        double period = 12;             // Период кредитования (мес)
        double Payment = service.calculate(sum, percent, period);
        String result = String.format("%.0f", Payment); // Округление
        System.out.println("Ежемесячный платеж составляет " + result + " рублей");
    }
}