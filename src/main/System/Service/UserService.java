package Service;

import DAO.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDao userDao;

    public List getAllUsers() {
        return userDao.getAllUsers();

    }

}
