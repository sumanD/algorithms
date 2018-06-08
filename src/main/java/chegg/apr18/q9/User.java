package chegg.apr18.q9;

import java.util.List;

/**
 * Class represent a User
 */
public class User {
    private String userName;
    private Membership membership;
    private PaymentPlan paymentPlan;
    private List<Activity> activities;

    public User(String userName, Membership membership, PaymentPlan paymentPlan, List<Activity> activities) {
        this.userName = userName;
        this.membership = membership;
        this.paymentPlan = paymentPlan;
        this.activities = activities;
    }

    public Membership getMembership() {
        return membership;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", membership=").append(membership);
        sb.append(", paymentPlan=").append(paymentPlan);
        sb.append(", activities=").append(activities);
        sb.append('}');
        return sb.toString();
    }
}
