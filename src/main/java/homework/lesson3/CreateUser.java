package homework.lesson3;

public interface CreateUser {
    User createUser();
    User createUser(int id, String name, String phone, String address, String email);
}
