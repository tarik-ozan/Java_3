package hrsmproject.hrsm.business.concretes;

import hrsmproject.hrsm.business.abstracts.JobService;
import hrsmproject.hrsm.dataAccess.abstracts.JobDao;
import hrsmproject.hrsm.entities.concretes.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public List<Jobs> getAll() {
        return this.jobDao.findAll();
    }
}
