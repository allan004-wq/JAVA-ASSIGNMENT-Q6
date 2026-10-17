// This is the parent class for all staff
public class Staff {

    // Common details for all staff members
    protected String StaffNo;
    protected String StaffName;
    protected int StaffAge;

    // Constructor to store staff details
    public Staff(String StaffNo, String StaffName, int StaffAge) {
        this.StaffNo = StaffNo;
        this.StaffName = StaffName;
        this.StaffAge = StaffAge;
    }

    // Method to display staff details
    public void displayDetails() {
        System.out.println("Staff Number: " + StaffNo);
        System.out.println("Staff Name: " + StaffName);
        System.out.println("Staff Age: " + StaffAge);
    }
}