public class Main {
    public static void main(String[] args) {
        double percentYear = 9.99;
        int summCredit = 1_000_000;
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платёж составляет " + Math.round(service.calculate(percentYear, summCredit, 12)) + " рублей");
        System.out.println("Ежемесячный платёж составляет " + Math.round(service.calculate(percentYear, summCredit, 24)) + " рублей");
        System.out.println("Ежемесячный платёж составляет " + Math.round(service.calculate(percentYear, summCredit, 36)) + " рублей");
    }
}
