import java.util.*;

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
		
        User user = new User(701, "Anuj", 21);
        user = User.addUser(702, "Kunal", 23, user);
        user = User.addUser(703, "Bhagyodaya", 21, user);
		
        User.addFriend(701, 702, user);
        User.addFriend(702, 703, user);
        User.addFriend(703, 701, user);
		
        User.displayFriends(702, user);
		
        User.findMutualFriends(701, 702, user);
		
        User.countFriends(user);
		
        User.removeFriend(702, 701, user);
		
        User.displayFriends(701, user);
    }
}

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }

    public static User addUser(int userId, String name, int age, User user) {
        User newUser = new User(userId, name, age);
        if (user == null) return newUser;
        User temp = user;
        while (temp.next != null) temp = temp.next;
        temp.next = newUser;
        return user;
    }

    public static void addFriend(int userId1, int userId2, User user) {
        User user1 = findUserById(userId1, user);
        User user2 = findUserById(userId2, user);
        if (user1 != null && user2 != null && !user1.friends.contains(userId2)) {
            user1.friends.add(userId2);
            user2.friends.add(userId1);
        }
    }

    public static void removeFriend(int userId1, int userId2, User user) {
        User user1 = findUserById(userId1, user);
        User user2 = findUserById(userId2, user);
        if (user1 != null && user2 != null) {
            user1.friends.remove(Integer.valueOf(userId2));
            user2.friends.remove(Integer.valueOf(userId1));
        }
    }

    public static void findMutualFriends(int userId1, int userId2, User user) {
        User user1 = findUserById(userId1, user);
        User user2 = findUserById(userId2, user);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friends);
            mutualFriends.retainAll(user2.friends);
            System.out.println("Mutual Friends: " + mutualFriends);
        }
    }

    public static void displayFriends(int userId, User user) {
        User foundUser = findUserById(userId, user);
        if (foundUser != null) System.out.println("Friends of " + foundUser.name + ": " + foundUser.friends);
    }

    public static User findUserById(int userId, User user) {
        User temp = user;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public static void countFriends(User user) {
        User temp = user;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }
}
