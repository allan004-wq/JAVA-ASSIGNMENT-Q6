import java.util.Scanner;

// FulltimeStaff inherits from Staff
public class FulltimeStaff extends Staff {

    // Monthly basic salary
    double basicSalary;

    // Constructor
    public FulltimeStaff(String StaffNo, String StaffName,
                         int StaffAge, double basicSalary) {

        // Call the parent constructor
        super(StaffNo, StaffName, StaffAge);

        this.basicSalary = basicSalary;
    }

    // Override the parent method
    @Override
    public void displayDetails() {

        // Display staff details
        System.out.println("Staff Number: " + StaffNo);
        System.out.println("Staff Name: " + StaffName);
        System.out.println("Staff Age: " + StaffAge);

        // Calculate example statutory deductions
        double deductions = basicSalary * 0.10;

        // Calculate monthly net salary
        double netPay = basicSalary - deductions;

        System.out.println("Monthly Net Salary: $" + netPay);
    }

    // Main method
    public static void main(String[] args) {

        // Create Scanner to capture input
        Scanner input = new Scanner(System.in);

        // Ask for staff details
        System.out.print("Enter Staff Number: ");
        String number = input.nextLine();

        System.out.print("Enter Staff Name: ");
        String name = input.nextLine();

        System.out.print("Enter Staff Age: ");
        int age = input.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary = input.nextDouble();

        // Create a FulltimeStaff object
        FulltimeStaff staff =
                new FulltimeStaff(number, name, age, salary);

        // Call the overridden method
        staff.displayDetails();

        input.close();
    }
}