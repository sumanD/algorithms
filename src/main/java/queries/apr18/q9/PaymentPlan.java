package queries.apr18.q9;

/**
 * Payment plan abstract class
 */
public abstract class PaymentPlan {
    private String planName;
    private PaymentStatus paymentStatus;

    public PaymentPlan(String planName, PaymentStatus paymentStatus) {
        this.planName = planName;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(planName).append('\'');
        return sb.toString();
    }
}
