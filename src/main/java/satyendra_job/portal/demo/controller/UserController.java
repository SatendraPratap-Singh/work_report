package satyendra_job.portal.demo.controller;

import org.springframework.web.bind.annotation.*;
import satyendra_job.portal.demo.model.JobPlan;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/jobplans")
public class UserController {

    // 🟢 Temporary storage
    private List<JobPlan> jobList = new ArrayList<>();

    // 🟢 SAVE DATA
    @PostMapping
    public JobPlan createJobPlan(@RequestBody JobPlan jobPlan) {

        jobList.add(jobPlan); // save in memory

        return jobPlan;
    }

    // 🟢 GET ALL DATA
    @GetMapping
    public List<JobPlan> getAllJobPlans() {
        return jobList;
    }

}