package employees;

import vehicles.Brand;

import java.util.ArrayList;

public class Mechanic extends Employee {
    private String garageLocation;

    private ArrayList<Brand> carsWorkedOn;

    public Mechanic(String firstName, String lastName, String email, String phoneNumber, String address, String garageLocation, ArrayList<Brand> carsWorkedOn) {
        super(firstName, lastName, email, phoneNumber, address);
        this.garageLocation = garageLocation;
        this.carsWorkedOn = carsWorkedOn;
    }

    public String getGarageLocation() {
        return garageLocation;
    }

    public void setGarageLocation(String garageLocation) {
        this.garageLocation = garageLocation;
    }

    public ArrayList<Brand> getCarsWorkedOn() {
        return carsWorkedOn;
    }

    public void setCarsWorkedOn(ArrayList<Brand> carsWorkedOn) {
        this.carsWorkedOn = carsWorkedOn;
    }

    public void addCarWorkedOn(Brand brand) {
        carsWorkedOn.add(brand);
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Mechanic{" +
                "garageLocation='" + garageLocation + '\'' +
                ", carsWorkedOn=" + carsWorkedOn +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
