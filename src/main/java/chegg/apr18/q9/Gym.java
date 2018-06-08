package chegg.apr18.q9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class which represent a GYM. It has list of Users
 */
public class Gym {
    private List<User> userList;

    public Gym() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public Set<String> getCurrentMemberTypes() {
        Set<String> membershipList = new HashSet<>();

        for (User user : userList) {
            membershipList.add(user.getMembership().toString());
        }
        return membershipList;
    }

    public void displayAllUsers() {
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
