package vehicles;

public class Model extends Brand {
    private String modelName;
    private Engine engineType;
    private String color;
    private int price;
    private int yearOfProduction;

    public Model(String brandName, String founderName, String ceoName, int revenue, String modelName, Engine engineType, String color, int price, int yearOfProduction) {
        super(brandName, founderName, ceoName, revenue);
        this.modelName = modelName;
        this.engineType = engineType;
        this.color = color;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                ", engineType=" + engineType +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", brandName='" + brandName + '\'' +
                ", founderName='" + founderName + '\'' +
                ", ceoName='" + ceoName + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
