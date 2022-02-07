public class CreditPaymentService {
    public double calculate(double percentYear, int summCredit, int creditTerm) {
        double percentMonth = percentYear / 1200; // ставка в месяц
        return summCredit * (percentMonth + percentMonth / (Math.pow(1 + percentMonth, creditTerm) - 1));
    }
}
