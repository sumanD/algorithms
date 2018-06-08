package chegg.apr18.q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Test Class
 */
public class ApplicationTest {

    /**
     * Main method to execute the program
     * @param args
     */
    public static void main(String[] args) {

        // Creating a GYM object and adding 10 users
        Gym gym = new Gym();

        for (int i = 0; i < 10; i++) {
            User user = constructUser(i);
            gym.addUser(user);
        }

        // Display All Users
        gym.displayAllUsers();

        // Display Current Membership plans
        Set<String> membershipSet = gym.getCurrentMemberTypes();
        System.out.println("Membership Plans = " + membershipSet);
    }

    private static User constructUser(int identifier) {
        String userName = "User" + identifier;
        Membership membership = null;
        PaymentPlan paymentPlan = null;

        if (identifier % 2 == 0) {
            membership = new AnnualMembership();
            paymentPlan = new FullPayment();
        } else {
            membership = new QuarterlyMembership();
            paymentPlan = new MonthlyPayment();
        }

        List<Activity> activityList = new ArrayList<>();
        activityList.add(Activity.aerobic);
        activityList.add(Activity.kickboxing);

        User user = new User(userName, membership, paymentPlan, activityList);
        return user;
    }
}
