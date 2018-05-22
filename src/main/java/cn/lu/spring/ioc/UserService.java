package cn.lu.spring.ioc;

/**
 * @author lu
 * @date 2018/5/22
 */
public interface UserService {

    User get(Long id);

    boolean save(User user);
}