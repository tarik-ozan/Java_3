package hrsmproject.hrsm.business.abstracts;

import hrsmproject.hrsm.entities.concretes.Jobs;

import java.util.List;

public interface JobService {
    List<Jobs> getAll();
}
