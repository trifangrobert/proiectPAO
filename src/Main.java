import employees.HumanResources;
import employees.Mechanic;
import employees.Seller;
import vehicles.Brand;
import vehicles.Engine;
import vehicles.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        CarService carService = new CarService("Car Service", "Address", new ArrayList<>(), new HashMap<>());

        carService.addEmployee(new HumanResources("John", "Doe", "johndoe@gmail.com", "123456789", "Str. Nowhere", 5, new ArrayList<String>(Arrays.asList("English","French"))));
        carService.addEmployee(new HumanResources("Jane", "Doe", "janedoe@gmail.com", "987654321", "Str. Nowhere", 3, new ArrayList<String>(Arrays.asList("English","Spanish"))));
        Brand brandLamborghini = new Brand("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238);
        Brand brandFerrari = new Brand("Ferrari", "Enzo Ferrari", "Louis Camilleri", 90);
        Brand brandPorsche = new Brand("Porsche", "Ferdinand Porsche", "Oliver Blume", 30);

        Mechanic mechanic1 = new Mechanic("John", "Smith", "johnsmith@gmail.com", "123456789", "Str. Nowhere", "Str. Somewhere", new ArrayList<Brand>(Arrays.asList(brandFerrari, brandLamborghini)));
        carService.addEmployee(new Mechanic("John", "Smith", "johnsmith@gmail.com", "123456789", "Str. Nowhere", "Str. Somewhere", new ArrayList<Brand>(Arrays.asList(brandFerrari, brandLamborghini))));
        carService.addEmployee(new Mechanic("Jane", "Smith", "janesmith@gmail.com", "987654321", "Str. Nowhere", "Str. Somewhere", new ArrayList<Brand>(Arrays.asList(brandLamborghini))));

        carService.addEmployee(new Seller("Elon", "Musk", "elonmusk@gmail.com", "123456789", "Str. Nowhere", "Q8 department", "Office location street"));
        Model urus = new Model("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238, "Urus", new Engine(4, 650, 478, "V8"), "Black", 300000, 2018);
        carService.addModel(new Model("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238, "Urus", new Engine(4, 650, 478, "V8"), "Black", 300000, 2018), 5);
        carService.addModel(new Model("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238, "Aventador", new Engine(12, 700, 700, "V12"), "Red", 400000, 2019), 2);
        carService.addModel(new Model("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238, "Huracan", new Engine(10, 610, 610, "V10"), "Yellow", 350000, 2017), 4);
        carService.addModel(new Model("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238, "Gallardo", new Engine(10, 560, 560, "V10"), "Blue", 250000, 2016), 7);

        carService.printEmployees();
        System.out.println("--------------------");

        carService.printModelsOnStock();
        carService.buyModel("Lamborghini", "Urus", 2);
        carService.printModelsOnStock();

        carService.repairModel(urus, mechanic1);

        carService.addBrandToMechanic(mechanic1, brandPorsche);
        carService.printMechanics();

        carService.createBrand("McLaren", "Bruce McLaren", "Mike Flewitt", 100);
        carService.createBrand("Bugatti", "Ettore Bugatti", "Stephan Winkelmann", 100);
        carService.createBrand("Lamborghini", "Ferruccio Lamborghini", "Stephan Winkelmann", 238);
        carService.createBrand("Ferrari", "Enzo Ferrari", "Louis Camilleri", 90);
        carService.createBrand("Porsche", "Ferdinand Porsche", "Oliver Blume", 30);
        carService.createBrand("BMW", "Karl Rapp", "Oliver Zipse", 100);

        carService.createEngine(8, 650, 650, "V8");
        carService.createEngine(10, 610, 610, "V10");
        carService.createEngine(12, 700, 700, "V12");

        carService.printBrands();
    }
}