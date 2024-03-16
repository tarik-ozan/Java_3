package hrsmproject.hrsm.api.controller;

import hrsmproject.hrsm.business.abstracts.JobService;
import hrsmproject.hrsm.entities.concretes.Jobs;
import hrsmproject.hrsm.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobControllers {
    private JobService jobService;


    public JobControllers() {
    }
    @Autowired
    public JobControllers(JobService jobService) {
        this.jobService = jobService;
    }


    @GetMapping("/getall")
    public List<Jobs> getAll(){
        return this.jobService.getAll();
    }
}
