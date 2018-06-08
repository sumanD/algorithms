package chegg.apr18.q9;
/**
 * Payment Type for Overdue payment option
 */
public class OverduePayment extends PaymentPlan {
    public OverduePayment() {
        super("OVERDUE_PAYMENT", PaymentStatus.OVERDUE);
    }
}
