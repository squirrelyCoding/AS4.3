public class App {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Annabelle Lee");

        // Create job instances
        FullTimeJob fullTimeJob = new FullTimeJob("Google", "Software Engineer", 12, 10, 2020, 27, 12, 2023, 30.0, 40);
        PartTimeJob partTimeJob = new PartTimeJob("Walmart", "Sales Associate", 1, 1, 2019, 14, 2, 2020, 15.0, 20);
        Contract contractJob = new Contract("Oscorp", "Project Manager", 2, 10, 2023, 4, 8, 2024, 50.0, 160);
        
        // Add jobs to employee's history
        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        // Display job history
        employee.displayJobHistory();
    }
}
