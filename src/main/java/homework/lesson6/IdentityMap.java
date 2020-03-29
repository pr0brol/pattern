package homework.lesson6;

import homework.lesson3.User;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private UserRepository userRepository;
    private static Map<Integer, User> users = new HashMap<Integer, User>();

    public IdentityMap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static boolean addUser(User user){
        if(users.get(user.getId()) != null){
            return false;
        }else {
            users.put(user.getId(), user);
            userRepository.save(user);
            return true;
        }
    }

    public static User getUser(int id){
        if(users.get(id) != null){
            return users.get(id);
        }
        return userRepository.findOneById(id);
    }
}
