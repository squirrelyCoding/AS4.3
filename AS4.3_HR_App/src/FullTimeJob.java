public class FullTimeJob extends Job {
        private double hourlyWage;
        private int hoursPerWeek;
    
        //constructor for fullTimeJob class
        public FullTimeJob(String companyName, String position, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear, double hourlyWage, int hoursPerWeek) {
            //super class that handles company name, position, start and end dates
            super(companyName, position, startDay, startMonth, startYear, endDay, endMonth, endYear);
            this.hourlyWage = hourlyWage;
            this.hoursPerWeek = hoursPerWeek;
        }
    
        @Override
        public void displayJobInfo() {
            System.out.println("Full-Time Job: " + position + " at " + companyName + " from " + startMonth + "/" + startDay + "/" + startYear + " to " + endMonth + "/" + endDay + "/" + endYear);
        }
    
        public double calculateSalary() {
            return hourlyWage * hoursPerWeek * 4; // Monthly salary
        }
    
        @Override
        public String assessJobSatisfaction() {
            return "The company was very flexible with her schedule.";
        }
}
