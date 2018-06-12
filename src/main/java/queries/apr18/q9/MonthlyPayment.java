package queries.apr18.q9;
/**
 * Payment Type for Monthly payment option
 */
public class MonthlyPayment extends PaymentPlan{
    public MonthlyPayment() {
        super("MONTHLY_PAYMENT", PaymentStatus.PARTIAL_PAYMENT);
    }
}
