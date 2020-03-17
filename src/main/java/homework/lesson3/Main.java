package homework.lesson3;

public class Main {

    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser();
        System.out.println(user.toString());

        User user1 = userFactory.createUser(1, "ivan", "5-55-15", "moscow", "user@mail.ru");
        System.out.println(user1.toString());
    }
}
