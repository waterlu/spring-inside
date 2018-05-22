package cn.lu.spring.ioc;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lu
 * @date 2018/5/22
 */
@Component
public class UserServiceMemoryImpl implements UserService {

    Map<Long, User> users = new ConcurrentHashMap();

    @Override
    public User get(Long id) {
        return users.get(id);
    }

    @Override
    public boolean save(User user) {
        return users.put(user.getId(), user) != null;
    }
}
