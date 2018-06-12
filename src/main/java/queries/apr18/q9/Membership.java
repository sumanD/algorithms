package queries.apr18.q9;

/**
 * Abstract membership class
 */
public abstract class Membership {
    private String planName;

    public Membership(String planName) {
        this.planName = planName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(planName).append('\'');
        return sb.toString();
    }
}
