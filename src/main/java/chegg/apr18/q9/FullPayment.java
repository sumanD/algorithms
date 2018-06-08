package chegg.apr18.q9;

/**
 * Payment Type for Full payment option
 */
public class FullPayment extends PaymentPlan {
    public FullPayment() {
        super("FULL_PAYMENT", PaymentStatus.PAID_IN_FULL);
    }
}
