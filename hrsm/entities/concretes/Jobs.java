package hrsmproject.hrsm.entities.concretes;

import jakarta.persistence.*;

@Entity
@Table(name = "job_titles")
public class Jobs {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "titles")
    private String jobTitle;

    public Jobs(){

    }

    public Jobs(int id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
