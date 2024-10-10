public abstract class Job {
    protected String companyName;
    protected String position;
    protected int startDay, startMonth, startYear;
    protected int endDay, endMonth, endYear;

    //constructor for job class
    public Job(String companyName, String position, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear) {
        this.companyName = companyName;
        this.position = position;
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    //displays job info using a void method
    public void displayJobInfo(){
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDay + "/" + startMonth + "/" + startYear);
        System.out.println("End Date: " + endDay + "/" + endMonth + "/" + endYear);
    }

    //calculates job duration in months (ex: 39 months working at Oscorp)
    public int calculateJobDuration() {
        return (endYear - startYear) * 12 + (endMonth - startMonth);
    }

    //calls the job satisfaction method
    public abstract String assessJobSatisfaction();
}
