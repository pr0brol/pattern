package homework.lesson4;

public class User extends AbstractUser {

    private int id;
    private String password;


    public User(UserDto user, int id, String password) {
        super(user);
        this.id = id;
        this.password = password;
    }

    public String getName(){
        return user.getName();
    }

    public String getPhone(){
        return user.getPhone();
    }

    public String getAddress(){
        return user.getAddress();
    }

    public String getEmail(){
        return user.getEmail();
    }
}
