package mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import mvc.Dao.UserDao;
import mvc.models.User;

@Service
public class UserserviceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserserviceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public int saveUser(User u1) {
        userDao.saveUsertoDB(u1);

        return 1;

    }

}
