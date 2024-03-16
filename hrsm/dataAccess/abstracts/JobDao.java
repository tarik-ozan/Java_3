package hrsmproject.hrsm.dataAccess.abstracts;

import hrsmproject.hrsm.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Jobs,Integer>{

}
