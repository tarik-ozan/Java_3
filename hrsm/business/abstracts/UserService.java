package hrsmproject.hrsm.business.abstracts;

import hrsmproject.hrsm.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
