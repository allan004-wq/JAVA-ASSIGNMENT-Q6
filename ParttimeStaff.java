import java.util.Scanner;

// ParttimeStaff inherits from Staff
public class ParttimeStaff extends Staff {

    // Number of hours worked
    int hoursWorked;

    // Fixed payment per hour
    double ratePerHour = 10;

    // Constructor
    public ParttimeStaff(String StaffNo, String StaffName,
                         int StaffAge, int hoursWorked) {

        // Call the parent constructor
        super(StaffNo, StaffName, StaffAge);

        this.hoursWorked = hoursWorked;
    }

    // Override the parent method
    @Override
    public void displayDetails() {

        // Display staff details
        System.out.println("Staff Number: " + StaffNo);
        System.out.println("Staff Name: " + StaffName);
        System.out.println("Staff Age: " + StaffAge);

        // Calculate total pay before tax
        double totalPay = hoursWorked * ratePerHour;

        // Calculate 30% tax
        double tax = totalPay * 0.30;

        // Calculate monthly net pay
        double netPay = totalPay - tax;

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Net Pay: $" + netPay);
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

        System.out.print("Enter Hours Worked: ");
        int hours = input.nextInt();

        // Create a ParttimeStaff object
        ParttimeStaff staff =
                new ParttimeStaff(number, name, age, hours);

        // Call the overridden method
        staff.displayDetails();

        input.close();
    }
}