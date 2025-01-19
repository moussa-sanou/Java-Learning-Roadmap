// Represents the personnel staff of particular business

public class Staff {

    private StaffMember [] staffList;

    // Constructor: Sets up the list of staff members.
    public Staff(){
        staffList = new StaffMember[6];

        staffList[0] = new Executive("Tony", "123 Main", "555-0469", "123-45-6789", 2423.07);
    }
}
