import employees.Employee;
import employees.HumanResources;
import employees.Mechanic;
import vehicles.Brand;
import vehicles.Engine;
import vehicles.Model;

import java.util.*;

public class CarService {
    private String name;
    private String address;
    private ArrayList<Employee> employees;
    private SortedSet<Brand> brands;
    private HashMap<Model, Integer> stock;

    public CarService(String name, String address, ArrayList<Employee> employees, HashMap<Model, Integer> stock) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.brands = new TreeSet<Brand>();
        this.stock = stock;
    }

    public Brand createBrand(String brandName, String founderName, String ceoName, int revenue) {
        Brand brand = new Brand(brandName, founderName, ceoName, revenue);
        brands.add(brand);
        return brand;
    }

    public void removeBrand(Brand brand) {
        brands.remove(brand);
    }
    public void addModel(Model model, int quantity) {
        if (stock.containsKey(model)) {
            stock.put(model, stock.get(model) + quantity);
        } else {
            stock.put(model, quantity);
        }
    }

    public void removeModel(Model model, int quantity) {
        if (stock.containsKey(model)) {
            if (stock.get(model) > quantity) {
                stock.put(model, stock.get(model) - quantity);
            } else {
                stock.remove(model);
            }
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        try {
            employees.remove(employee);
        } catch (Exception e) {
            System.out.println("Employee not found");
        }
    }

    public void printBrands() {
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }
    public void printModelsOnStock() {
        for (Model model : stock.keySet()) {
            System.out.println(model.getBrandName() + " " + model.getModelName() + " " + stock.get(model));
        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void buyModel(String brandName, String modelName, int quantity) {
        for (Model model : stock.keySet()) {
            if (model.getBrandName().equals(brandName) && model.getModelName().equals(modelName)) {
                if (stock.get(model) > quantity) {
                    stock.put(model, stock.get(model) - quantity);
                } else {
                    stock.remove(model);
                }
            }
        }
    }

    public Engine createEngine(float size, int horsePower, int torque, String name) {
        return new Engine(size, horsePower, torque, name);
    }
    public void repairModel(Model model, Mechanic mechanic) {

        String listOfBrands[] = new String[mechanic.getCarsWorkedOn().size()];
        int i = 0;
        for (Brand brand : mechanic.getCarsWorkedOn()) {
            listOfBrands[i] = brand.getBrandName();
            i++;
        }
        for (String brand : listOfBrands) {
            if (brand.equals(model.getBrandName())) {
                System.out.println("Car repaired");
                return;
            }
        }
        System.out.println("Mechanic can't repair this car");
    }

    public void printMechanics() {
        for (Employee employee : employees) {
            if (employee instanceof Mechanic) {
                System.out.println(employee);
            }
        }
    }

    public void addBrandToMechanic(Mechanic mechanic, Brand brand) {
        employees.remove(mechanic);
        mechanic.addCarWorkedOn(brand);
        employees.add(mechanic);
    }

}
