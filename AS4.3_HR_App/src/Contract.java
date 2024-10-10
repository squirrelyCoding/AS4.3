//contract class taking from the Job class
public class Contract extends Job {
    private double hourlyRate;
    private int hoursWorked;

    //constructor
    public Contract(String companyName, String position, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear, double hourlyRate, int hoursWorked) {
        super(companyName, position, startDay, startMonth, startYear, endDay, endMonth, endYear);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    //displays job info for contract job (position, company name, start and end date)
    public void displayJobInfo() {
        System.out.println("Contract Job: " + position + " at " + companyName + " from " + startMonth + "/" + startDay + "/" + startYear + " to " + endMonth + "/" + endDay + "/" + endYear);
    }

    @Override
    //displays how satisfied the employee was at this job (wanted to do something different so I did the employee's perspective)
    public String assessJobSatisfaction() {
        return "The company was very strict with her schedule. It left much to be desired.";
    }
    @Override
    public int calculateJobDuration() {
        // Calculate duration in months (for simplicity)
        int durationYears = endYear - startYear;
        int durationMonths = endMonth - startMonth;
        return durationYears * 12 + durationMonths;
    }

    // Extra method to calculate total payment for the contract job
    public double calculatePayment() {
        return hourlyRate * hoursWorked; // Total payment based on hours worked
    }
}