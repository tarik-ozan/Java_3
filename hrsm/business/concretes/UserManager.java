package hrsmproject.hrsm.business.concretes;

import hrsmproject.hrsm.business.abstracts.UserService;
import hrsmproject.hrsm.dataAccess.abstracts.UserDao;
import hrsmproject.hrsm.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {

    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }
}
