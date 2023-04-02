package vehicles;

public class Engine {
    private double size;
    private int horsePower;
    private int torque;
    private String name;

    public double getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(float size, int horsePower, int torque, String name) {
        this.size = size;
        this.horsePower = horsePower;
        this.torque = torque;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                ", horsePower=" + horsePower +
                ", torque=" + torque +
                ", name='" + name + '\'' +
                '}';
    }
}
