public class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;
    
    public PartTimeJob(String companyName, String position, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDay, startMonth, startYear, endDay, endMonth, endYear);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
    
    @Override
    public void displayJobInfo() {
        System.out.println("Part-Time Job: " + position + " at " + companyName + " from " + startDay + "/" + startMonth + "/" + startYear + " to " + endDay + "/" + endMonth + "/" + endYear);
    }
    
    @Override
    public String assessJobSatisfaction() {
        return "They were slightly strict with scheduling and rules, but they were also lenient. Overall, not a bad place to work.";
    }
    @Override
    public int calculateJobDuration() {
        // Calculate duration in months
        int durationYears = endYear - startYear;
        int durationMonths = endMonth - startMonth;
        return durationYears * 12 + durationMonths;
    }

    // Extra method to calculate total pay for the part-time job
    public double calculateTotalPay() {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks in a month
    }
}
