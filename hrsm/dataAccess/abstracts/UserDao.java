package hrsmproject.hrsm.dataAccess.abstracts;

import hrsmproject.hrsm.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
