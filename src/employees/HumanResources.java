package employees;

import java.util.ArrayList;

public class HumanResources extends Employee{
    private int yearsOfExperience;
    private ArrayList<String> languages;

    public HumanResources(String firstName, String lastName, String email, String phoneNumber, String address, int yearsOfExperience, ArrayList<String> languages) {
        super(firstName, lastName, email, phoneNumber, address);
        this.yearsOfExperience = yearsOfExperience;
        this.languages = languages;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "HumanResources{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", languages=" + languages +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
