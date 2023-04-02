import employees.Employee;
import vehicles.Brand;
import vehicles.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarService {
    private String name;
    private String address;
    private ArrayList<Employee> employees;
    private ArrayList<Brand> brands;
    private HashMap<Model, Integer> stock;
    public CarService(String name, String address, ArrayList<Employee> employees, ArrayList<Brand> brands, HashMap<Model, Integer> stock) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.brands = brands;
        this.stock = stock;
        System.out.println("Car Service created");

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
        employees.remove(employee);
    }

    public void printModelsOnStock() {
        for (Model model : stock.keySet()) {
            System.out.println(model);
        }
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
