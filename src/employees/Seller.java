package employees;

public class Seller extends Employee {
    private String department;
    private String officeLocation;

    public Seller(String firstName, String lastName, String email, String phoneNumber, String address, String department, String officeLocation) {
        super(firstName, lastName, email, phoneNumber, address);
        this.department = department;
        this.officeLocation = officeLocation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Seller{" +
                "department='" + department + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
