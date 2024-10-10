import java.util.ArrayList;

//uses arrayList to get employee's job data
public class Employee {
    private String name;
    private ArrayList<Job> jobHistory;

    //constructor for employee class
    public Employee(String name) {
        this.name = name;
        this.jobHistory = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobHistory.add(job);
    }

    //displays name, job info including job duration and personal satisfaction from employee
    public void displayJobHistory() {
        System.out.println("Job History for " + name + ":");
        for (Job job : jobHistory) {
            job.displayJobInfo();
            System.out.println("Job Duration: " + job.calculateJobDuration() + " months");
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println();
        }
    }
}
