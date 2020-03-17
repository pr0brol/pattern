package homework.lesson3;

public class UserFactory implements CreateUser {

    public User createUser() {
        return new User();
    }

    public User createUser(int id, String name, String phone, String address, String email) {
        return new User(id, name, phone, address, email);
    }
}
