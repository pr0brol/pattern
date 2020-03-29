package homework.lesson6;

import homework.lesson3.User;

@Service
public class DataMapper {
    private UserRepository userRepository;

    public DataMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(int id) {
        return userRepository.findOneById(id);
    }

    public User save(User user) {return userRepository.save(user);}

    public User update(User user) {
        User tempUser = userRepository.findOneById(user.getId());
        tempUser.setId(user.getId());
        tempUser.setAddress(user.getAddress());
        tempUser.setEmail(user.getEmail());
        tempUser.setName(user.getName());
        tempUser.setPhone(user.getPhone());
        return userRepository.save(tempUser);
    }

    public boolean delete(User user){
        return userRepository.delete(user);
    }
}
