package homework.lesson6;

import homework.lesson3.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findOneById(int id);
    boolean existsById(int id);
    User save(User user);
    boolean delete(User user);
}
